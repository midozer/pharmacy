package sid.pharmacy.Controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.WebUtils;

import sid.pharmacy.Model.Produit;
import sid.pharmacy.Model.Users;
import sid.pharmacy.Service.ProduitService;
import sid.pharmacy.dao.ProduitDao;

@Controller
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@Autowired
	private ProduitDao produitDao;
	
	//public static final Logger LOGGER = LoggerFactory.getLogger(ProduitController.class);
	
	
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
		model.addAttribute("typeProduitRecherche", "");
		model.addAttribute("nomProduitRecherche", "");
		model.addAttribute("listProduit", produitService.findAll());
	    return "produit";
	}
	
	@RequestMapping(value = "/modifierproduit", method = RequestMethod.GET)
	public String updateProduit(@RequestParam("codeproduit") Long codeProduit, Model model)
	{
		Produit produit = produitService.findBycodeProduit(codeProduit);
		model.addAttribute("produit", produit);
		model.addAttribute("listProduit", produitService.findAll());
		return "produit";
	}
	
	@RequestMapping(value = "/supprimerproduit", method = RequestMethod.GET)
	public String deleteProduit(@RequestParam("codeproduit") Long codeProduit, Model model)
	{
		produitService.deleteBycodeProduit(codeProduit);
		return "redirect:/produit";
	}
	
	@RequestMapping(value = "/chercherproduitbytype", method = RequestMethod.GET)
	public String chercherProduit(@RequestParam(name = "typeProduitRecherche") String typeProduit, Model model)
	{
		List<Produit> produit = produitService.findBytypeProduit(typeProduit);
		model.addAttribute("produit", new Produit());
		model.addAttribute("listProduit", produit);
		return "produit";
	}
	
	@RequestMapping(value = "/chercherproduitbynom", method = RequestMethod.GET)
	public String chercherProduitByNom(@RequestParam(name = "nomProduitRecherche") String nomProduit, Model model)
	{
		List<Produit> produit = produitService.findBynomProduit(nomProduit);
		model.addAttribute("produit", new Produit());
		model.addAttribute("listProduit", produit);
		return "produit";
	}
	
	/*
	 * @RequestMapping(value = "/userconnected") public ModelAndView user() {
	 * Authentication authentication =
	 * SecurityContextHolder.getContext().getAuthentication();
	 * LOGGER.info("------ getContext : " +
	 * SecurityContextHolder.getContext().getAuthentication()); ModelAndView mav =
	 * new ModelAndView("Welcome"); mav.addObject("username",
	 * authentication.getName()); return mav; }
	 */
	
	/*
	 * @RequestMapping(value = "/userInfo", method = RequestMethod.GET) public
	 * String userInfo(Model model, Principal principal) {
	 * 
	 * // After user login successfully. String username = principal.getName();
	 * 
	 * System.out.println("User Name: " + username);
	 * 
	 * Users loginedUser = (Users) ((Authentication) principal).getPrincipal();
	 * 
	 * String userInfo = WebUtils.toString(loginedUser);
	 * model.addAttribute("userInfo", userInfo);
	 * 
	 * return "produit"; }
	 */
}
