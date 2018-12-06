/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 *
 * @author Portege R30
 */
@Entity
@Table(name = "penyewa")
@NamedQueries({
    @NamedQuery(name = "Penyewa.getAll", query = "SELECT p FROM Penyewa p order by p.penyewaId")})
public class Pasien implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int penyewaId;
    @Column
    private String nama;
    @Column
    private String alamat;
    @Column 
    private String notlpn;
    @Column
    private String noktp;

    public Pasien(int penyewaId, String nama, String alamat, String notlpn, String noktp) {
        this.penyewaId = penyewaId;
        this.nama = nama;
        this.alamat = alamat;
        this.notlpn = notlpn;
        this.noktp = noktp;
    }

    public Pasien() {
    }

    public int getPenyewaId() {
        return penyewaId;
    }

    public void setPenyewaId(int penyewaId) {
        this.penyewaId = penyewaId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotlpn() {
        return notlpn;
    }

    public void setNotlpn(String notlpn) {
        this.notlpn = notlpn;
    }

    public String getNoktp() {
        return noktp;
    }

    public void setNoktp(String noktp) {
        this.noktp = noktp;
    }

}

