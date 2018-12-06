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
@Table(name = "mobil")
@NamedQueries({
    @NamedQuery(name = "Mobil.getAll", query = "SELECT m FROM Mobil m order by m.mobilId")})
public class Kamar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int mobilId;
    @Column
    private String tipe;
    @Column
    private String merk;
    @Column 
    private String noplat;
    @Column
    private int penyewaid;
    @Column
    private String warna;
    @Column
    private String tahun;
    @Column
    private String nomesin;

    public Kamar(int mobilId, String tipe, String merk, String noplat, int penyewaid, String warna, String tahun, String nomesin) {
        this.mobilId = mobilId;
        this.tipe = tipe;
        this.merk = merk;
        this.noplat = noplat;
        this.penyewaid = penyewaid;
        this.warna = warna;
        this.tahun = tahun;
        this.nomesin = nomesin;
    }

    public Kamar() {
    }

    public int getMobilId() {
        return mobilId;
    }

    public void setMobilId(int mobilId) {
        this.mobilId = mobilId;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNoplat() {
        return noplat;
    }

    public void setNoplat(String noplat) {
        this.noplat = noplat;
    }

    public int getPenyewaid() {
        return penyewaid;
    }

    public void setPenyewaid(int penyewaid) {
        this.penyewaid = penyewaid;
    }
   
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getNomesin() {
        return nomesin;
    }

    public void setNomesin(String nomesin) {
        this.nomesin = nomesin;
    }

}

