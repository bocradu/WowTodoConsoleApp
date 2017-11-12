package com.WowTodoConsoleApp;

public class AddTodoExecutor implements ITodoExecutor{
    @Override
    public boolean Execute(TodoBase todo, TodoRepository repo) {
        return repo.AddTodo(todo);
    }
}
