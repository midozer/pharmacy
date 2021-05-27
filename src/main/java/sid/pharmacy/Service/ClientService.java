package sid.pharmacy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sid.pharmacy.dao.ClientDao;

@Service
@Transactional
public class ClientService {
	@Autowired
	ClientDao clientDao;
	
}
