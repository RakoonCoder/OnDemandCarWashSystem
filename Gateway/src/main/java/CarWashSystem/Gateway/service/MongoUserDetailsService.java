package CarWashSystem.Gateway.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import CarWashSystem.Gateway.model.Users;
import CarWashSystem.Gateway.repository.UserRepository;

@Component
public class MongoUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;
    
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = repository.findByUsername(username);
		
		  if(user==null){
			  throw new UsernameNotFoundException("User not found");
		  }
		  
		  List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("user"));
		  
		  return new User( user.getUsername(), user.getPassword(), authorities);
	}

}
