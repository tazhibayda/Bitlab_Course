package com.example.bitlab_course;



import com.example.Entity.Person;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;



@WebServlet(value = "/home")

public class HomeServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {

    }



    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<table class=\"table table-sm\">\n" +
                "  <thead>\n" +
                "    <tr>\n" +
                "      <th scope=\"col\">Name</th>\n" +
                "      <th scope=\"col\">Surname</th>\n" +
                "      <th scope=\"col\">Department</th>\n" +
                "      <th scope=\"col\">Salary</th>\n" +
                "    </tr>\n");


        Person []persons = new Person[10];

        for (int i = 0; i < 10; i++) {
            persons[i] = new Person("Name_"+(i+1),"Surname_"+(i+1),"Department"+(i+1),i+1);
        }

        for (Person person:persons){
            out.println("  </thead>\n" +
                    "  <tbody>\n" +
                    "    <tr>\n" +
                    "      <th scope=\"row\">"+person.getName()+"</th>\n" +
                    "      <td>"+person.getSurname()+"</td>\n" +
                    "      <td>"+person.getDepartment()+"</td>\n" +
                    "      <td>"+person.getSalary()+"</td>\n" +
                    "    </tr>\n" +
                    "  </tbody>\n");
        }

        out.println("</table>");

    }

}