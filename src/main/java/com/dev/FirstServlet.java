package com.dev;

// lifecycle : init(){}, service() destroy()

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        String userName = req.getParameter("username");
        out.println("Welcome " + userName);

        HttpSession session = req.getSession();
        session.setAttribute("uname",userName);

        out.println("<a href='" + resp.encodeURL("home") + "'>visit</a>");

    }
}
