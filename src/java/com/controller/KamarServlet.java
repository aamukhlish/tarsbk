/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.KamarDAOLocal;
import com.model.Kamar;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Portege R30
 */
@WebServlet(name = "MobilServlet")
public class KamarServlet extends HttpServlet {

    @EJB
    private KamarDAOLocal kamarDAO;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (null != session.getAttribute("loginName")) {
            String action = request.getParameter("action");
            String mobilIdStr = request.getParameter("mobilId");
            int mobilId = 0;
            if (mobilIdStr != null && !mobilIdStr.equals("")) {
                mobilId = Integer.parseInt(mobilIdStr);
            }
            String tipe = request.getParameter("tipe");
            String merk = request.getParameter("merk");
            String noplat = request.getParameter("noplat");
            
            int penyewaid = 0;
            String penyewaidStr = request.getParameter("penyewaid");
            if (penyewaidStr != null && !penyewaidStr.equals("")) {
                penyewaid = Integer.parseInt(penyewaidStr);
            }
            
            String warna = request.getParameter("warna");
            String tahun = request.getParameter("tahun");
            String nomesin = request.getParameter("nomesin");
            
            Kamar kamar = new Kamar(mobilId, tipe, merk, noplat, penyewaid, warna, tahun, nomesin);
            
            if ("Add".equalsIgnoreCase(action)) {
                kamarDAO.addKamar(kamar);
            } else if ("Edit".equalsIgnoreCase(action)) {
                kamarDAO.editKamar(kamar);
            } else if ("Delete".equalsIgnoreCase(action)) {
                kamarDAO.deleteKamar(kamarId);
            } else if ("Search".equalsIgnoreCase(action)) {
                kamar = kamarDAO.getKamar(kamarId);
            } 
            request.setAttribute("kamar", kamar);
            request.setAttribute("allKamar", kamarDAO.getAllKamar());
            request.getRequestDispatcher("kamar.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

