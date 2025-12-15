package com.example.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DavidApplication {
   public void details(String name){
	   System.out.println("name ="+ name);
	   if(name.equals("David")){
		   System.out.println("name matched congratulation");
	   }
   }
	public static void main(String[] args) {
		SpringApplication.run(DavidApplication.class, args);

		System.out.println(" Welcome to git");
	}

}
