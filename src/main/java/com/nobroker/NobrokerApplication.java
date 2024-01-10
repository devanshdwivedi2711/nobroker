package com.nobroker;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NobrokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NobrokerApplication.class, args);
	}

  @Bean
   public ModelMapper modelMapper(){
		return new ModelMapper();
   }
   //spring ioc does not have info   about Modelmapper class thats why we caonfiguring giving the
	// when we have to use out side class which is not a from spring boot class .
	// it is built class come from another library for that we are usig @ Bean
}
