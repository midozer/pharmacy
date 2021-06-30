/*
 * package sid.pharmacy.Controllers;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping;
 * 
 * import sid.pharmacy.Model.Client; import sid.pharmacy.Service.ClientService;
 * 
 * 
 * public class ClientController {
 * 
 * @Autowired ClientService clientService;
 * 
 * 
 * @GetMapping("/client") public String Afficher(Model model) { List<Client>
 * listClient = clientService.listAll(); model.addAttribute("listClient",
 * listClient); return "client"; }
 * 
 * }
 */