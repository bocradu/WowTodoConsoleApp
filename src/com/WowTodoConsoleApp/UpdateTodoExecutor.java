package com.WowTodoConsoleApp;

public class UpdateTodoExecutor implements ITodoExecutor {
    @Override
    public boolean Execute(TodoBase todo, TodoRepository repo) {
        repo.UpdateTodo(todo);
        return true;
    }
}
