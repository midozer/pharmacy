package sid.pharmacy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Service.PharmacieService;


public class PharmacieController {
	
	@Autowired
	private PharmacieService pharmacieService;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
    public String index() {
        return "index";
    }
	
	@RequestMapping(value = "/pharmacie", method = RequestMethod.GET)
	public String AfficherPharmacie(Model model)
	{
		Pharmacie pharmacie = new Pharmacie();
		
		model.addAttribute("pharmacie", pharmacie);
		return "/pharmacie";
	}
}
