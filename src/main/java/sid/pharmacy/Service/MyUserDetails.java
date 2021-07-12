/*
 * package sid.pharmacy.Service;
 * 
 * import java.util.ArrayList; import java.util.Collection; import
 * java.util.List; import java.util.Set;
 * 
 * import org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails;
 * 
 * import sid.pharmacy.Model.Users; import sid.pharmacy.security.Role;
 * 
 * public class MyUserDetails implements UserDetails {
 * 
 * private Users users;
 * 
 * 
 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
 * Set<Role> roles = users.getUserRoles(); List<SimpleGrantedAuthority>
 * authorities = new ArrayList<>(); for(Role role : roles) { authorities.add(new
 * SimpleGrantedAuthority(role.getName())); } return authorities; }
 * 
 * 
 * @Override public String getPassword() { return users.getPassword(); }
 * 
 * @Override public String getUsername() { return users.getUsername(); }
 * 
 * @Override public boolean isAccountNonExpired() { // TODO Auto-generated
 * method stub return true; }
 * 
 * @Override public boolean isAccountNonLocked() { // TODO Auto-generated method
 * stub return true; }
 * 
 * @Override public boolean isCredentialsNonExpired() { // TODO Auto-generated
 * method stub return true; }
 * 
 * @Override public boolean isEnabled() { // TODO Auto-generated method stub
 * return users.isEnabled(); }
 * 
 * }
 */