package com.sabel.myFirstWebApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>My First Webapp</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1> Meine erste WebApp</h1>");
        writer.println("<p> Hallo Welt</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
