package com.WebProject_BackEnd.BackEnd.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.WebProject_BackEnd.BackEnd.Entity.LoginEntity;
import com.WebProject_BackEnd.BackEnd.Model.LoginModel;

@Repository
public class LoginDImpl implements Login{

	@PersistenceContext
	EntityManager entityManager;
	
	public boolean LoginModule(LoginModel l) throws Exception{
		
		LoginEntity loginEntity = entityManager.find(LoginEntity.class, l.getUsername());
		
		System.out.println("IN DAO CLASS");
		if(loginEntity.getPassword().matches(l.getPassword())) return true;
		
		return false;
	}
	
	
}
