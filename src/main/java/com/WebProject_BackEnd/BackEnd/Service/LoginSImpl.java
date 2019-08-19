package com.WebProject_BackEnd.BackEnd.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebProject_BackEnd.BackEnd.DAO.LoginDImpl;
import com.WebProject_BackEnd.BackEnd.Model.LoginModel;

@Service
@Transactional
public class LoginSImpl implements Login{

	@Autowired
	LoginDImpl login;
	
	public boolean LoginModule(LoginModel l) throws Exception{
		
		boolean isLoggedIn = login.LoginModule(l);
		System.out.println("IN SERVICE CLASS");
		
		return isLoggedIn;
	}
	
}
