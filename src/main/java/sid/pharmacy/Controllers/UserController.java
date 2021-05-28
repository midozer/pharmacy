package sid.pharmacy.Controllers;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sid.pharmacy.Model.Users;
import sid.pharmacy.Service.UserService;
import sid.pharmacy.dao.RoleDao;
import sid.pharmacy.security.Role;
import sid.pharmacy.security.UserRole;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
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
}
