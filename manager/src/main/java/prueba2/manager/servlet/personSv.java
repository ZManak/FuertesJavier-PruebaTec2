/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package prueba2.manager.servlet;

import prueba2.manager.logic.Person;
import prueba2.manager.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Manak
 */
public class personSv extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Forward the request to the JSP file
        request.getRequestDispatcher("/WEB-INF/personSv.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        int ticketNumber = Integer.parseInt(request.getParameter("ticketRef"));
        String description = request.getParameter("description");
        String date = request.getParameter("date");

        Person person = new Person(name);
        java.sql.Date date1 = new java.sql.Date(0);
        date1.setTime(java.sql.Date.valueOf(date).getTime());


        PersonService personService = new PersonService();
        try {
            personService.saveTicket(person, ticketNumber, description, date1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.getStatus();
        processRequest(personService.saveTicket(person, ticketNumber, description, date1), response);

        //processRequest(request, response);
    }
*/
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        int ticketNumber = Integer.parseInt(request.getParameter("ticketRef"));
        String description = request.getParameter("description");
        String date = request.getParameter("date");

        Person person = new Person(name);
        java.sql.Date date1 = new java.sql.Date(0);
        date1.setTime(java.sql.Date.valueOf(date).getTime());

        PersonService personService = new PersonService();
        try {
            personService.saveTicket(person, ticketNumber, description, date1);
        } catch (Exception e) {
            e.printStackTrace();
        }

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
    }//
    // </editor-fold>

}
