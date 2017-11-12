package com.WowTodoConsoleApp;

public class RemoveTodoExecutor implements ITodoExecutor{
    @Override
    public boolean Execute(TodoBase todo, TodoRepository repo) {
        return repo.RemoveTodo(todo);
    }
}


