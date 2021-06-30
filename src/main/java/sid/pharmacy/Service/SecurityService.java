package sid.pharmacy.Service;

import org.springframework.stereotype.Service;

public interface SecurityService {
	boolean isAuthenticated();
    void autoLogin(String username, String password);
}
