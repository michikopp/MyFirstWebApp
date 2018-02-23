package com.sabel.myFirstWebApp.todo;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
public class ToDoStore implements Serializable{

    private List<ToDo> todos;

    public ToDoStore() {
        this.todos = new ArrayList<>();
        this.todos.add(new ToDo("Java EE lernen"));
        this.todos.add(new ToDo("Ba lernen"));
        this.todos.add(new ToDo("Tanzen lernen"));
    }

    public void store(ToDo toDo) {
        todos.add(toDo);
    }

    public void delete(ToDo toDo) {
        todos.remove(toDo);
    }

    public List<ToDo> getTodos() {
        return todos;
    }
}
