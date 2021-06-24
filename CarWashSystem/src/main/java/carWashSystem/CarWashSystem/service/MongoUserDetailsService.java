package carWashSystem.CarWashSystem.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import carWashSystem.CarWashSystem.repository.UserRepository;



public class MongoUserDetailsService {
	
	@Autowired
	private UserRepository repository;
    
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		carWashSystem.CarWashSystem.model.User user = repository.findByUsername(username);
		
		  if(user==null){
			  throw new UsernameNotFoundException("User not found");
		  }
		  
		  List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("user"));
		  
		  return new User( user.getUsername(), user.getPassword(), authorities);
	}

}
