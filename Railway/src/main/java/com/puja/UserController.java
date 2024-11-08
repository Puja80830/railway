package com.puja;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private final UserRepository userRepository;
	
	
    public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


		@GetMapping("/")	
          public List<User> getuser() {
	      return  this.userRepository.findAll();
         }
		

		@GetMapping("/paul")	
        public String getWish() {
	      return "Sucessfully Deployed";
       }
		
}
