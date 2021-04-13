/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modbikes.filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
//@WebFilter(filterName = "LoginFilter", urlPatterns = {"/*"}, dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE})
@WebFilter(filterName = "LoginFilter", servletNames =  {"HistoryServlet", "IndexServlet"}, dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE})
public class LoginFilter implements Filter {


    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession(false);
//        if (session != null) {
//            Account accountObj = (Account) session.getAttribute("account");
//            if (accountObj != null) {
//                chain.doFilter(request, response);
//                return;
//            }
//            if (accountObj == null) {
//                filterConfig.getServletContext().getRequestDispatcher("/Login").forward(request, response);
//                return;
//            }
//
//            if (session == null) {
//
//                filterConfig.getServletContext().getRequestDispatcher("/Login").forward(request, response);
//                chain.doFilter(request, response);
//                return;
//            }
//        }

        if(session == null || session.getAttribute("account") == null){
                filterConfig.getServletContext().getRequestDispatcher("/LoginServlet").forward(request, response);
        return;
        }else{
        chain.doFilter(request, response);
        }
    
    }

    @Override
    public void destroy() {

    }

}
