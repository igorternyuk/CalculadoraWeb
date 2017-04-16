/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacion.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author igor
 */
@WebServlet(name = "ServletOperaciones", urlPatterns = {"/ServletOperaciones"})
public class MIServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MIServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MIServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        response.setContentType("text/html;charset=UTF-8");        
        try (PrintWriter out = response.getWriter()){            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mi calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            //Aqui realizamos nuestros operaciones
            String num1 = request.getParameter("textNum1");
            String num2 = request.getParameter("textNum2");
            String btnSuma = request.getParameter("btnSumar");
            String btnResta = request.getParameter("btnRestar");
            String btnMultiplicacion = request.getParameter("btnMultiplicar");
            String btnDivicion = request.getParameter("btnDividir");
            String btnPower = request.getParameter("btnPower");
            
            System.out.println("btnSuma = " + btnSuma);
            System.out.println("btnResta = " + btnResta);
            System.out.println("btnMultiplicacion = " + btnMultiplicacion);
            System.out.println("btnDivicion = " + btnDivicion);
            
            if(btnSuma != null) {
                double resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
                out.println("El resultado de la suma es : " + resultado);
                System.out.println("El resultado de la suma es : " + resultado);
            }
            if(btnResta != null) {
                double resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
                out.println("El resultado de la resta es : " + resultado);
                System.out.println("El resultado de la resta es : " + resultado);
            }
            if(btnMultiplicacion != null) {
                double resultado = Double.parseDouble(num1) * Double.parseDouble(num2);
                out.println("El resultado de la multiplicacion es : " + resultado);
                System.out.println("El resultado de la multiplicacion es : " + resultado);
            }   
            if(btnDivicion != null) {
                double resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
                out.println("El resultado de la divicion es : " + resultado);
                System.out.println("El resultado de la divicion es : " + resultado);
            }
            if(btnPower != null) {
                double resultado = Math.pow(Double.parseDouble(num1), Double.parseDouble(num2));
                out.println("El resultado de la elevacion es : " + resultado);
                System.out.println("El resultado de la elevacion es : " + resultado);
            }  
            out.println("</body>");
            out.println("</html>");
        } 
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
