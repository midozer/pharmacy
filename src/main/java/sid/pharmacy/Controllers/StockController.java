
  package sid.pharmacy.Controllers;
  
  import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import
  org.springframework.stereotype.Controller;
import
  org.springframework.ui.Model;
import
  org.springframework.web.bind.annotation.ModelAttribute;
import
  org.springframework.web.bind.annotation.RequestMapping;
import
  org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Model.Produit;
import sid.pharmacy.Model.Stock;
import
  sid.pharmacy.Service.ProduitService;
import
  sid.pharmacy.Service.StockService;
import sid.pharmacy.dao.PharmacieDao;
import sid.pharmacy.dao.ProduitDao;
import sid.pharmacy.dao.StockDao;
  
  @Controller public class StockController {
  
	  @Autowired 
	  private StockService stockService;
	  
	  @Autowired 
	  private StockDao stockDao;
	  
	  @Autowired 
	  private PharmacieDao pharmacieDao;
	  
	  @Autowired 
	  private ProduitDao produitDao;
	  
	  @Autowired 
	  private ProduitService produitService;
	  
	  @RequestMapping(value = "/stock", method = RequestMethod.POST)
	  public String saveAuStock(@ModelAttribute("stock") Stock stock, Model model)
	  {
		  System.out.println(stock.toString());
		  System.out.println("test");
				
		  stockDao.save(stock);
		  model.addAttribute("produit",stock.getNomProduit());
		  model.addAttribute("pharmacie",stock.getNomPharmacie());
		  return "redirect:/stock";
	  }
  
	  @RequestMapping(value = "/stock", method = RequestMethod.GET)
	  public String ajouterAuStock(Model model, String nomPharmacie, String nomProduit)
	  {
		  Stock stock = new Stock();
		  model.addAttribute("stock", stock);
		  model.addAttribute("detailstStock", stockService.findAll());
		  
		  List<Pharmacie> pharmacie = pharmacieDao.findAll();
	      model.addAttribute("pharmacie", pharmacie);
	      
	      List<Produit> produit = produitDao.findAll();
	      model.addAttribute("produit", produit);
	      
		  return "stock";
	  }
	  
	  @RequestMapping(value = "/modifierstock", method = RequestMethod.GET)
	  public String updateStock(@RequestParam("quantitee") int quantite , Model model)
	  {
		  Stock stock = stockService.findByQuantite(quantite);
		  model.addAttribute("stock", stock);
		  model.addAttribute("detailstStock", stockService.findAll());
		  
		  List<Pharmacie> pharmacie = pharmacieDao.findAll();
	      model.addAttribute("pharmacie", pharmacie);
	      
	      List<Produit> produit = produitDao.findAll();
	      model.addAttribute("produit", produit);
	      
		  
		  return "stock";
	  }
  
	
	/*
	 * @RequestMapping(value="/stock", method = RequestMethod.GET) public String
	 * ajouterProduit(Model model) { Stock stock = new Stock();
	 * model.addAttribute("stock", stock);
	 * model.addAttribute("listProduct",produitService.findAll()); return "stock"; }
	 */
	 
  
/*
 * @RequestMapping(value = "/modifierstock", method = RequestMethod.GET) public
 * String modifierProduit(@RequestParam("produit") Produit produit, Model model)
 * { Stock stock = stockService.findByPharmacie(null)
 * model.addAttribute("stock", stock); model.addAttribute("listProduct",
 * stockService.findAllProduct()); return "stock"; } }
 */
  }
 