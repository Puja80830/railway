package com.puja;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RailwayApplication  implements CommandLineRunner{
	private final UserRepository userRepository;
	
	
    public RailwayApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(RailwayApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		if(this.userRepository.findAll().size()==0) {
			this.userRepository.save(User.builder().name("puja").build());
		}
		
	}

}
