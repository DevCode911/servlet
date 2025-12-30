package com.dev;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        Cookie[] cookie = req.getCookies();
        for (int i = 0; i < cookie.length; i++) {
            out.println(cookie[i].getName() + " : " + cookie[i].getValue());
        }


        HttpSession session = req.getSession(false);

        if (session != null) {
            String name = (String) session.getAttribute("uname");
            out.println("Hello " + name);
        } else {
            out.println("Please login first");
        }


    }
}
