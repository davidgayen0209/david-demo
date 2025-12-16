package com.example.david;

import com.example.david.entity.Constant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DavidApplication {
   public void details(String name){
	   if(name.equals(Constant.NAME_TYPE)){
		   System.out.println("name matched congratulation");
	   }
   }

	public void addMethod(){
		System.out.println("new method added");
	}
	public static void main(String[] args) {
		SpringApplication.run(DavidApplication.class, args);

		System.out.println(" Welcome to git");
	}

}
