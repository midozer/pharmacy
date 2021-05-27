package sid.pharmacy.Model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import sid.pharmacy.security.UserRole;

@Entity
public class Users implements UserDetails {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	private Long userId;
	private String nom;
	private String prenom;
	private String password;
	private String username;
	private String email;
	private String telephone;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER) //un utilisateur peut avoir plusieur role
	@JsonIgnore //lors de lecture ou ecriture Jsonignore va ignorer la liste des roles
	private Set<UserRole> userRoles = new HashSet<>();
	
	
	
	
	/*
	 * public Users(String nom, String prenom, String password, String username,
	 * String email, String telephone) { super(); this.nom = nom; this.prenom =
	 * prenom; this.password = password; this.username = username; this.email =
	 * email; this.telephone = telephone; }
	 */


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Set<UserRole> getUserRoles() {
		return userRoles;
	}


	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}



	


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public String toString() {
		return "Users [userId=" + userId + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password
				+ ", username=" + username + ", email=" + email + ", telephone=" + telephone + "]";
	}


	public String getPassword() {
		return password;
	}


	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

}
