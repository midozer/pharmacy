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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import sid.pharmacy.security.Authority;
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
	private boolean enabled = true;
	
	@OneToOne
	@JoinColumn(name = "idPharmacie")
	private Pharmacie pharmacie;
	
	

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


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
	

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> authorities = new HashSet<>();
        userRoles.forEach(ur -> authorities.add(new Authority(ur.getRole().getName())));
        return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}


	@Override
	public String toString() {
		return "Users [userId=" + userId + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password
				+ ", username=" + username + ", email=" + email + ", telephone=" + telephone + "]";
	}


	public String getPassword() {
		return password;
	}


	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(String nom, String prenom, String password, String username, String email, String telephone,
			boolean enabled, Pharmacie pharmacie, Set<UserRole> userRoles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.username = username;
		this.email = email;
		this.telephone = telephone;
		this.enabled = enabled;
		this.pharmacie = pharmacie;
		this.userRoles = userRoles;
	}


	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}
}
