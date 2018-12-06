/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Kamar;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Portege R30
 */
@Stateless
public class KamarDAO implements KamarDAOLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addKamar (Kamar kamar) {
        em.merge(kamar);
        em.flush();
    }

    @Override
    public void editKamar(Kamar kamar) {
        em.merge(kamar);
        em.flush();
    }

    @Override
    public void deleteKamar(int kamarId) {
        em.remove(getKamar(kamarId));
        em.flush();
    }

    @Override
    public Kamar getKamar(int kamarId) {
        em.flush(); 
        return em.find(Kamar.class, kamarId); 
    }

    @Override
    public List<Kamar> getAllKamar() {
        em.flush(); 
        return em.createNamedQuery("Kamar.getAll").getResultList(); 
    }

}

