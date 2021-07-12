package sid.pharmacy.Controllers;


import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Model.Users;
import sid.pharmacy.Service.PharmacieService;
import sid.pharmacy.Service.SecurityService;
import sid.pharmacy.Service.UserService;
import sid.pharmacy.dao.PharmacieDao;
import sid.pharmacy.dao.RoleDao;
import sid.pharmacy.dao.UserDao;
import sid.pharmacy.security.Role;
import sid.pharmacy.security.UserRole;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PharmacieService pharmacieService;
	
	@Autowired
	private PharmacieDao pharmacieDao;
	
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
    public String inscription(Model model, Principal principal) {
		
		Users user = new Users();
		//Users user = userService.findByUsername(principal.getName());
		List<Role> listRoles = roleDao.findAll();
		List<Pharmacie> pharmacie = pharmacieDao.findAll();
		model.addAttribute("listRoles", listRoles);
		model.addAttribute("pharmacie", pharmacie);
		
		//Users users = new Users();
		String userRoles = "";
		System.out.println("size userRole "+ user.getUserRoles().size());
		System.out.println("size userRole "+ user.getUserRoles().size());
		//System.out.println(((Role)user.getUserRoles().toArray()[0]).getName());
		if(user.getUserRoles() != null && !user.getUserRoles().isEmpty())
		{
			for(UserRole userRole : user.getUserRoles())
			{
				userRoles = userRoles + " " + userRole.getRole().getName();
			}
		}
		
		user.setRoles(userRoles);
		model.addAttribute("user", user);

        model.addAttribute("user", user);
        return "inscription";
    }
	
	@RequestMapping(value = "/inscription", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") Users users)
	{
		Set<UserRole> userRoles = new HashSet<>();
   	 	Role role = roleDao.findByName("simple_user");
   	 	//System.out.println("role object : "+role.toString());
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
	public String profile(Principal principal, Model model, String pharmacies) {
		Users user = userService.findByUsername(principal.getName());
		
		List<Role> listRoles = roleDao.findAll();
		List<Pharmacie> pharmacie = pharmacieDao.findAll();
		model.addAttribute("listRoles", listRoles);
		model.addAttribute("pharmacie", pharmacie);
		
		//Users users = new Users();
		String userRoles = "";
		System.out.println("size userRole "+ user.getUserRoles().size());
		System.out.println("size userRole "+ user.getUserRoles().size());
		//System.out.println(((Role)user.getUserRoles().toArray()[0]).getName());
		if(user.getUserRoles() != null && !user.getUserRoles().isEmpty())
		{
			for(UserRole userRole : user.getUserRoles())
			{
				userRoles = userRoles + " " + userRole.getRole().getName();
			}
		}
		user.setRoles(userRoles);
		
		
		model.addAttribute("user", user);
		
		return "profil";
	}
	
	
	@RequestMapping(value = "/profil", method = RequestMethod.POST) 
	public String saveProfil(@ModelAttribute("user") Users newUser, Model model) { 
		
		  Users user = userService.findByUsername(newUser.getUsername());
		  user.setUserId(newUser.getUserId()); 
		  user.setNom(newUser.getNom());
		  user.setPrenom(newUser.getPrenom()); 
		  user.setUsername(newUser.getUsername());
		  user.setEmail(newUser.getEmail()); 
		  user.setTelephone(newUser.getTelephone());
		  user.setIdPharmacie(newUser.getIdPharmacie());
		  
		  String userRoles = "";
		  System.out.println("size userRole "+ newUser.getUserRoles().size());
		  System.out.println("size userRole "+ newUser.getUserRoles().size());
		  //System.out.println(((Role)newUser.getUserRoles().toArray()[0]).getName());
		  if(newUser.getUserRoles() != null && !newUser.getUserRoles().isEmpty())
		  {
			  for(UserRole userRole : newUser.getUserRoles())
			  {
				  userRoles = userRoles + " " + userRole.getRole().getName();
			  }
		  }
		  
		  user.setRoles(userRoles);
		  
		  model.addAttribute("user", user);
		 
		System.out.println(user.toString());
		System.out.println("test");
		//model.addAttribute("user", new User());
		userDao.save(user);
		  
		return "redirect:/profil"; 
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
	public String updateProfil(@RequestParam("userid") Long userId, Model model, Users newUser)
	{
		Users users = userService.findByuserId(userId);
			//users.setUserId(newUser.getUserId()); 
			/*
			 * users.setNom(newUser.getNom()); users.setPrenom(newUser.getPrenom());
			 * users.setUsername(newUser.getUsername()); users.setEmail(newUser.getEmail());
			 * users.setTelephone(newUser.getTelephone());
			 * users.setIdPharmacie(newUser.getIdPharmacie());
			 * users.setRoles(newUser.getRoles());
			 */
		  
			/*
			 * String userRoles = ""; System.out.println("size userRole "+
			 * newUser.getUserRoles().size()); System.out.println("size userRole "+
			 * newUser.getUserRoles().size());
			 * //System.out.println(((Role)newUser.getUserRoles().toArray()[0]).getName());
			 * if(newUser.getUserRoles() != null && !newUser.getUserRoles().isEmpty()) {
			 * for(UserRole userRole : newUser.getUserRoles()) { userRoles = userRoles + " "
			 * + userRole.getRole().getName(); } }
			 * 
			 * users.setRoles(userRoles);
			 */
		
		  model.addAttribute("users", users);
		  model.addAttribute("user", userService.findAll());
		  
		  List<Role> listRoles = roleDao.findAll();
		  model.addAttribute("listRoles", listRoles);
		  		  
		  List<Pharmacie> pharmacie = pharmacieDao.findAll();
		  model.addAttribute("pharmacie", pharmacie);
		  
		  return "profil";
	}
	
}
