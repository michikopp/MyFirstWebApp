package com.sabel.myFirstWebApp.todo;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {

    @Inject
    private ToDoService todoService;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String todoName = req.getParameter("name");
        System.out.println(todoName);
        todoService.delete(new ToDo(todoName));
        resp.sendRedirect("/todo.do");
    }

}
