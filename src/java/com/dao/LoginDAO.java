/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Login;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Portege R30
 */
@Stateless
public class LoginDAO implements LoginDAOLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean checkUser(String username, String password) {
        List<Login> s = (List<Login>) em.createQuery("select e from Login e where e.username='" + username + "' and e.password='" + password + "'").getResultList();
        System.out.println("is list empty ?" + s.isEmpty() + " for the" + username + " and " + password);
        if (!s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
// Add business logic below. (Right-click in editor and choose 
// "Insert Code > Add Business Method") 
}
