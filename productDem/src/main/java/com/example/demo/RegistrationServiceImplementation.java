package com.example.demo;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImplementation {
	
	@Autowired
	IRegistration registration;

	@PersistenceContext
	  private EntityManager entityManager;
	
	public Registration save(Registration registration2) {
		// TODO Auto-generated method stub
		return registration.save(registration2);
	}
	
	

	public List<Registration> findbyusername(String uname) {
		
		Query query = entityManager.createNativeQuery("SELECT * from Registration where user_name="+uname+"",Registration.class);
		List<Registration>  list  = query.getResultList();
		if(list.size()>0) {
			return list;
		}else {
			return Collections.EMPTY_LIST;
		}
	}



	@Transactional
	public BigInteger NumberOfUsers() {
		Query query =  entityManager.createNativeQuery( "select count(*)  from  Registration");
		BigInteger count = (BigInteger) query.getSingleResult();
		return  count;
	}
	
	
}
