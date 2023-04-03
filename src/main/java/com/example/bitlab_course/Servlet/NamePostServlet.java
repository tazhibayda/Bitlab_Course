package com.example.bitlab_course.Servlet;

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(value = "/post")

public class NamePostServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><head><title>MyServlet</title></head>");
        writer.println("<body><h1>You entered: </h1>");
        writer.println("<p>Name: " + firstName + "</p> <td>");
        writer.println("<p>Surname: " + lastName + "</p>");
        writer.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");


        request.getRequestDispatcher("WEB-INF/NamePost.html").forward(request,response);
    }
}