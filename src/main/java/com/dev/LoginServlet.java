package com.dev;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        String email = req.getParameter("username");
        String password = req.getParameter("password");

        out.println("<h1 >" + email+ " " + password + "</h1>");

        if (email.equals("dev@gmail.com") && password.equals("dev123")){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("auth/home.jsp");
            requestDispatcher.forward(req,resp);
        }else {
            out.println("ERROR");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("auth/error.jsp");
            requestDispatcher.include(req,resp);
        }

    }
}
