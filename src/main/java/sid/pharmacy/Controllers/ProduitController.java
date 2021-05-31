package sid.pharmacy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sid.pharmacy.Model.Produit;
import sid.pharmacy.Service.ProduitService;
import sid.pharmacy.dao.ProduitDao;

@Controller
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@Autowired
	private ProduitDao produitDao;
	
	
	
	
	/*
	 * @RequestMapping(value = "/produit", method = RequestMethod.GET) public String
	 * getProduit(Model model) {
	 * 
	 * model.addAttribute("listProduit", produitService.findAll()); return
	 * "produit"; }
	 */
	
	@RequestMapping(value = "/produit", method = RequestMethod.POST)
	public String saveProduit(@ModelAttribute("produit") Produit produits)
	{
		System.out.println(produits.toString());
		System.out.println("test");
		
		produitDao.save(produits);
		return "redirect:/produit";
	}
	
	@RequestMapping(value = "/produit", method = RequestMethod.GET)
	public String ajouterProduit(Model model)
	{
		Produit produit = new Produit();
		model.addAttribute("produit", produit);
		model.addAttribute("listProduit", produitService.findAll());
	    return "produit";
	}
	
	@RequestMapping(value = "/modifierproduit", method = RequestMethod.GET)
	public String updateProduit(@RequestParam("nomproduit") String nomProduit, Model model)
	{
		Produit produit = produitService.findBynomProduit(nomProduit);
		model.addAttribute("produit", produit);
		model.addAttribute("listProduit", produitService.findAll());
		return "produit";
	}
	
	@RequestMapping(value = "/supprimerproduit", method = RequestMethod.GET)
	public String deleteProduit(@RequestParam("nomproduit") String nomProduit, Model model)
	{
		produitService.deleteBynomProduit(nomProduit);
		return "redirect:/produit";
	}
}
