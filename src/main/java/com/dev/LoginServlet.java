package com.dev;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        value = "/login",
        initParams = {
                @WebInitParam(name = "adminEmail", value = "admin@gmail.com"),
                @WebInitParam(name = "Id", value = "3"),
        }
)
public class LoginServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getInitParameter("adminEmail"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        String email = req.getParameter("username");
        String password = req.getParameter("password");

        out.println("<h1 >" + email+ " " + password + "</h1>");

        if (email.equals("dev@gmail.com") && password.equals("dev123")){
            Cookie cookie = new Cookie("email", email);
            cookie.setMaxAge(2);
            resp.addCookie(cookie);
//            RequestDispatche  r requestDispatcher = req.getRequestDispatcher("home");
//            requestDispatcher.forward(req,resp);
            resp.sendRedirect("home");
        }else {
            out.println("ERROR");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("auth/error.jsp");
            requestDispatcher.include(req,resp);
        }




    }
}
