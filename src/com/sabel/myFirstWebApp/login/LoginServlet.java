package com.sabel.myFirstWebApp.login;

import com.sabel.myFirstWebApp.todo.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login.do", "/einloggen"})
public class LoginServlet extends HttpServlet {

    private LoginService loginService = new LoginService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pass = req.getParameter("password");

        if (loginService.checkPassword(name, pass)) {
            req.setAttribute("name", req.getParameter("name"));
            req.getSession().setAttribute("name", name);
            resp.sendRedirect("/todo.do");

        } else {
            req.setAttribute("errorMessage", "Login nicht erfolgreich");
            req.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(req, resp);
        }


    }
}
