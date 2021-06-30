
  package sid.pharmacy.Controllers;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Controller; import
  org.springframework.ui.Model; import
  org.springframework.web.bind.annotation.ModelAttribute; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RequestMethod; import
  org.springframework.web.bind.annotation.RequestParam;
  
  import sid.pharmacy.Model.Produit; import sid.pharmacy.Model.Stock; import
  sid.pharmacy.Service.ProduitService; import
  sid.pharmacy.Service.StockService; import sid.pharmacy.dao.StockDao;
  
  @Controller public class StockController {
  
  @Autowired private StockService stockService;
  
  
  @Autowired private ProduitService produitService;
  
  @RequestMapping(value="/stock", method = RequestMethod.POST) 
  public String enregistrerProduit(@ModelAttribute("stock") Stock stock) {
	  System.out.println(stock.toString()); 
	  System.out.println("test");
	  
	  stockService.save(stock); 
	  return "redirect:/stock"; 
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
 