package com.WowTodoConsoleApp;

import java.util.ArrayList;

public class TodoRepository {

    private ArrayList<TodoBase> todos;

    public TodoRepository(){
        todos=new ArrayList<>();
    }

    public boolean AddTodo(TodoBase todo){
        boolean addResult = todos.add(todo);
        return addResult;
    }

    public boolean RemoveTodo(TodoBase todo){
        boolean removeResult = todos.remove(todo);
        return removeResult;
    }

    public TodoBase FindTodo(String id){
        for (TodoBase todo : todos) {
            if (todo.getId().equals(id)) {
                return todo;
            }
        }
        return null;
    }

    public ArrayList<TodoBase> GetTodos() throws CloneNotSupportedException {
        ArrayList<TodoBase> clonedTodos=new ArrayList<>();
        for (TodoBase todo : todos) {
            clonedTodos.add((TodoBase) todo.clone());
        }
        return new ArrayList<>(todos);
    }
}

