/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Pasien;
import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author Portege R30
 */
@Local
public interface PasienDAOLocal {    
    void addPasien(Pasien pasien);
    void editPasien(Pasien pasien);
    void deletePasien(int pasienId);
    Pasien getPasien(int pasienId);
    List<Pasien> getAllPasien();
}

