package CarWashSystem.Gateway.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import CarWashSystem.Gateway.service.MongoUserDetailsService;

@Configuration
@EnableConfigurationProperties
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	MongoUserDetailsService userDetailsService;

	protected void configure(HttpSecurity http) throws Exception{
		
		 http
	    .csrf().disable()
	    .authorizeRequests().antMatchers(HttpMethod.OPTIONS,"**/**").permitAll()
	                        .antMatchers("/admin").hasAuthority("ADMIN").anyRequest()
	                        .authenticated()
	                        .and().formLogin().permitAll()
	                        .and().httpBasic();
		
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
		
	}
	
	public void configure(AuthenticationManagerBuilder builder) throws Exception{
		builder.userDetailsService(userDetailsService);
	}
}
