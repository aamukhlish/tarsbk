/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Pasien;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Portege R30
 */
@Stateless
public class PasienDAO implements PasienDAOLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addPasien(Pasien pasien) {
        em.merge(pasien);
        em.flush();
    }

    @Override
    public void editPasien(Pasien pasien) {
        em.merge(pasien);
        em.flush();
    }

    @Override
    public void deletePasien(int pasienId) {
        em.remove(getPasien(pasienId));
        em.flush();
    }

    @Override
    public Pasien getPasien(int pasienId) {
        em.flush(); 
        return em.find(Pasien.class, pasienId); 
    }

    @Override
    public List<Pasien> getAllPasien() {
        em.flush(); 
        return em.createNamedQuery("Pasien.getAll").getResultList(); 
    }
}

