package sid.pharmacy.Controllers;


import java.security.Principal;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sid.pharmacy.Model.Users;
import sid.pharmacy.Service.SecurityService;
import sid.pharmacy.Service.UserService;
import sid.pharmacy.dao.RoleDao;
import sid.pharmacy.security.Role;
import sid.pharmacy.security.UserRole;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/*
	 * @Autowired private SecurityService securityService;
	 */
	
	@Autowired
	private RoleDao roleDao;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
    public String index() {
        return "index";
    }
	
	@RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public String inscription(Model model) {
		
		Users user = new Users();

        model.addAttribute("user", user);
        return "inscription";
    }
	
	@RequestMapping(value = "/inscription", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") Users users)
	{
		Set<UserRole> userRoles = new HashSet<>();
   	 	Role role = roleDao.findByName("ROLE_PHARMACIEN");
        userRoles.add(new UserRole(users, role));
        
		System.out.println(users.toString());
		userService.createUser(users, userRoles);
		return "inscription";
	}
	
	@RequestMapping(value = "/acceuil", method = RequestMethod.GET)
	public String acceuil()
	{
		return "acceuil";
	}
	
	@RequestMapping(value = "/profil", method = RequestMethod.GET)
	public String profile(Principal principal, Model model) {
		Users user = userService.findByUsername(principal.getName());
		
		//Users users = new Users();
		model.addAttribute("user", user);

		return "profil";
	}
	
	
	@RequestMapping(value = "/profil", method = RequestMethod.POST) 
	public String profilePost(@ModelAttribute("user") Users newUser, Model model) { 
		Users user = userService.findByUsername(newUser.getUsername());
		user.setUserId(newUser.getUserId());
		user.setNom(newUser.getNom()); 
		user.setPrenom(newUser.getPrenom());
		user.setUsername(newUser.getUsername()); 
		user.setEmail(newUser.getEmail());
		user.setTelephone(newUser.getTelephone());
		  
		model.addAttribute("user", user);
		  
		userService.save(user);
		  
		return "profil"; 
	}
	
	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.GET) public String
	 * login(Model model, String error, String logout) { if
	 * (securityService.isAuthenticated()) { return "redirect:/"; }
	 * 
	 * if (error != null) model.addAttribute("error",
	 * "Your username and password is invalid.");
	 * 
	 * if (logout != null) model.addAttribute("message",
	 * "You have been logged out successfully.");
	 * 
	 * return "login"; }
	 */
	
	@RequestMapping(value = "/modifierprofil", method = RequestMethod.GET)
	public String updateProfil(@RequestParam("userid") Long userId, Model model)
	{
		Users users = userService.findByuserId(userId);
		model.addAttribute("users", users);
		model.addAttribute("user", userService.findAll());
		return "profil";
	}
	
}
