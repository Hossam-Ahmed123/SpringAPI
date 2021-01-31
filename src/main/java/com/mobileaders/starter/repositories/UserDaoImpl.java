package com.mobileaders.starter.repositories;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobileaders.starter.entities.Users;

@Repository
public class UserDaoImpl {

	
	
    @Autowired
    private EntityManager em;

    public Users save(Users user) {
        Session session = em.unwrap(Session.class);
        session.persist(user);
        return user;
    }

}
