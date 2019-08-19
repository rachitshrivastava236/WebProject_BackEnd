package com.WebProject_BackEnd.BackEnd.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.WebProject_BackEnd.BackEnd.Model.LoginModel;
import com.WebProject_BackEnd.BackEnd.Service.LoginSImpl;

@RestController
public class LoginController {
	
	@Autowired
	LoginSImpl login;
	
	@PostMapping("/login")
	public String Login(@RequestBody LoginModel l) throws Exception{
		
		boolean isLoggedIn = login.LoginModule(l);
		System.out.println("API HIT");
		if(isLoggedIn == true) return "Succesfully Logged In";
		else return "Login Failed";
		 
	}

}
