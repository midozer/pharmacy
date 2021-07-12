package sid.pharmacy.config;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import sid.pharmacy.Service.UserSecurityService;
import sid.pharmacy.Service.imp.UserServiceImp;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired 
    private Environment env; //variable session

    @Autowired
    private UserSecurityService userSecurityService;

    private static final String SALT = "salt"; // Salt should be protected carefully

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserServiceImp();
    }
    
	
	  @Bean public BCryptPasswordEncoder passwordEncoder() { 
		  return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes())); }
	 
    
	/*
	 * @Bean public BCryptPasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 */
    
	
	  @Bean public DaoAuthenticationProvider authenticationProvider() {
		  DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		  authProvider.setPasswordEncoder(passwordEncoder());
		  authProvider.setUserDetailsService(userSecurityService); 
		  return authProvider;
	  }
	 
    
	/*
	 * @Bean public DaoAuthenticationProvider authenticationProvider() {
	 * DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	 * authProvider.setUserDetailsService(userDetailsService());
	 * authProvider.setPasswordEncoder(passwordEncoder());
	 * 
	 * return authProvider; }
	 */

    private static final String[] PUBLIC_MATCHERS = {
            "/webjars/**",
            "/css/**",
            "/js/**",
            "/images/**",
            "/",
            "/about/**",
            "/contact/**",
            "/error/**/*",
            "/console/**",
			 "/inscription" 
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests().
				/*
				 * .formLogin() .loginPage("/inscription.html")
				 * .loginProcessingUrl("/inscription") .defaultSuccessUrl("/profil.html",true)
				 */
				/*
				 * antMatchers("/pharmacie").hasAuthority("super_admin").
				 * antMatchers("/inscription").hasAuthority("admin").
				 * antMatchers("/inscription").hasAuthority("super_admin").
				 */
                antMatchers(PUBLIC_MATCHERS).
                permitAll().anyRequest().authenticated();

        http
                .csrf().disable().cors().disable()
                .formLogin().failureUrl("/index?error").defaultSuccessUrl("/profil").loginPage("/index").permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/index?logout").deleteCookies("remember-me").permitAll()
                .and()
                .rememberMe().
                and()
                .exceptionHandling().accessDeniedPage("/403")
                ;
    }



    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * auth.inMemoryAuthentication().withUser("m.zer").password("1234").roles(
		 * "PHARMACIEN") .and()
		 * .withUser("i.bray").password("1234").roles("PHARMACIEN");
		 */ //This is in-memory authentication
        auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
    	//auth.authenticationProvider(authenticationProvider());
    }


}
