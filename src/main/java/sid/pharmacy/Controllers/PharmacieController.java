package sid.pharmacy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Model.Produit;
import sid.pharmacy.Service.PharmacieService;
import sid.pharmacy.dao.PharmacieDao;

@Controller
public class PharmacieController {
	
	@Autowired
	private PharmacieService pharmacieService;
	
	@Autowired
	private PharmacieDao pharmacieDao;
	
	/*
	 * @RequestMapping("/") public String home() { return "redirect:/index"; }
	 * 
	 * @RequestMapping("/index") public String index() { return "index"; }
	 */
	@RequestMapping(value = "/pharmacie", method = RequestMethod.POST)
	public String savePharmacie(@ModelAttribute("pharmacie") Pharmacie pharmacie)
	{
		System.out.println(pharmacie.toString());
		System.out.println("test");
		
		pharmacieDao.save(pharmacie);
		return "redirect:/pharmacie";
	}
	
	@RequestMapping(value = "/pharmacie", method = RequestMethod.GET)
	public String ajouterPharmacie(Model model)
	{
		Pharmacie pharmacie = new Pharmacie();
		model.addAttribute("pharmacie", pharmacie);
		model.addAttribute("listPharmacie", pharmacieService.findAll());
		return "pharmacie";
	}
	
	@RequestMapping(value = "/modifierpharmacie", method = RequestMethod.GET)
	public String updatePharmacie(@RequestParam("nompharmacie") String nomPharmacie, Model model)
	{
		Pharmacie pharmacie = pharmacieService.findBynomPharmacie(nomPharmacie);
		model.addAttribute("pharmacie", pharmacie);
		model.addAttribute("listPharmacie", pharmacieService.findAll());
		return "pharmacie";
	}
	
	@RequestMapping(value = "/supprimerpharmacie", method = RequestMethod.GET)
	public String deletePharmacie(@RequestParam("nompharmacie") String nomPharmacie, Model model)
	{
		pharmacieService.deleteBynomPharmacie(nomPharmacie);
		return "redirect:/pharmacie";
	}
}
