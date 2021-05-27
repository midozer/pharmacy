package sid.pharmacy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sid.pharmacy.Model.Produit;
import sid.pharmacy.Service.ProduitService;

@Controller
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	
	@RequestMapping(value = "/produit", method = RequestMethod.GET)
    public String getProduit(Model model) {
		
        model.addAttribute("listProduit", produitService.findAll());
        return "produit";
    }
	
	@RequestMapping(value = "/produit", method = RequestMethod.POST)
	public String saveProduit(@ModelAttribute("listProduit") Produit produits)
	{
		System.out.println("test");
		
		  System.out.println(produits.toString());
		  produitService.createProduit(produits);
		 
		return "produit";
	}
}
