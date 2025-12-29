package com.dev;

// lifecycle : init(){}, service() destroy()

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/my-servlet")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.setContentType("application/json");
//        resp.setCharacterEncoding("UTF-8");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

//        Student student = new Student(1,"dev");
//        String json = "{"
//                + "\"id\":" + student.getId() + ","
//                + "\"name\":\"" + student.getName() + "\""
//                + "}";

//        out.print(json);
//        out.flush();
            out.println("Welcome to servlet Page");
        System.out.println("Welcome to servlet Page");



    }
}
