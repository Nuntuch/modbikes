/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modbikes.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.modbikes.model.operation.QueryDB;
/**
 *
 * @author Admin
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String idS = request.getParameter("id");
        String pinS = request.getParameter("pin");

        if (idS != null && idS.trim().length() > 0
                && pinS != null && pinS.trim().length() > 0) {

            int id = Integer.parseInt(idS);
            int pin = Integer.parseInt(pinS);

            QueryDB queryDBObj = new QueryDB();
            boolean canlogin = queryDBObj.CheckUsernameAndPassword(pinS, pinS)
            
            AccountJpaController accountJpaCtrl = new AccountJpaController(utx, emf);
// //            Account accountObj = accountJpaCtrl.findAccount(id);
            if (accountObj != null) {

                if (accountObj.getPin() == pin) {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("account", accountObj);
//                    getServletContext().getRequestDispatcher("/MyAccount").forward(request, response);
                    response.sendRedirect(getServletContext().getContextPath()+"/MyAccount");
                    return;
                } else {
                    request.setAttribute("status", "PIN Worng!!!");
                    getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
                    return;
                }

            }
            request.setAttribute("status", "ID Worng!!!");
            getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        }
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);






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
