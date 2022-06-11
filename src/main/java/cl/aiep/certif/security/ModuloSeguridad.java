package cl.aiep.certif.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
		  prePostEnabled = true, 
		  securedEnabled = true, 
		  jsr250Enabled = true)
public class ModuloSeguridad extends WebSecurityConfigurerAdapter{
	
	
	@Autowired
	DataSource dataSource;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {

    	http.httpBasic()
    	.and()
    	.authorizeRequests()
//    	.antMatchers(HttpMethod.GET, "/obtiene/**").hasAuthority("USER")
//    	.antMatchers(HttpMethod.GET, "/obtiene/").hasAuthority("USER")
//    	.antMatchers(HttpMethod.POST, "/obtiene").hasAuthority("ADMIN")
//	    .antMatchers(HttpMethod.PUT, "/obtiene/**").hasAuthority("ADMIN")
//	    .antMatchers(HttpMethod.PUT, "/api/savePais/**").hasAuthority("ADMIN")
//	    .antMatchers(HttpMethod.PATCH, "/obtiene/**").hasAuthority("ADMIN")
	    .antMatchers(HttpMethod.GET, "/admin/**").hasAuthority("ADMIN")
	    .antMatchers(HttpMethod.POST, "/admin/**").hasAuthority("ADMIN")
    	.antMatchers(HttpMethod.GET, "/registrate").permitAll()
        .and()
        .formLogin().loginPage("/login").permitAll()
        .and()
        .logout().clearAuthentication(true).logoutSuccessUrl("/").permitAll();    
        
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
	
	
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder())
    	.dataSource(dataSource) 
    	.usersByUsernameQuery("select rut, password, enabled from estudiante where rut=?");
    }

}
