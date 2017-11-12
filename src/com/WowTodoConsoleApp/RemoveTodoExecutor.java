package com.WowTodoConsoleApp;

public class RemoveTodoExecutor implements TodoExecutor{
    @Override
    public boolean Execute(TodoBase todo, TodoRepository repo) {
        return repo.RemoveTodo(todo);
    }
}


