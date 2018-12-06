/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import javax.ejb.Local;
import com.model.Kamar;
import java.util.List;


/**
 *
 * @author Portege R30
 */
@Local
public interface KamarDAOLocal {
    void addKamar(Kamar kamar);
    void editKamar(Kamar kamar);
    void deleteKamar(int kamarId);
    Kamar getKamar(int kamarId);
    List<Kamar> getAllKamar();
}

