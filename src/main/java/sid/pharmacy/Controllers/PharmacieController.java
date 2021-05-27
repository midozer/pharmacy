package sid.pharmacy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sid.pharmacy.Service.PharmacieService;

@Controller
public class PharmacieController {
	
	@Autowired
	private PharmacieService pharmacieService;
	
	/*
	 * @RequestMapping("/") public String home() { return "redirect:/index"; }
	 * 
	 * @RequestMapping("/index") public String index() { return "index"; }
	 */
	
	@RequestMapping(value = "/pharmacie", method = RequestMethod.GET)
	public String getPharmacie(Model model)
	{
		
		model.addAttribute("pharmacie", pharmacieService.findAll());
		return "pharmacie";
	}
}
