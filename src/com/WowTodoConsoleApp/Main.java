package com.WowTodoConsoleApp;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
	// write your code here
      //  Scanner s = new Scanner(System.in);
        TodoRepository repo=new TodoRepository();
        TodoBase raid=new RaidTodo();
       // TodoBase mythicDungoenTodo=new MythicDungoenTodo();
        System.out.println(repo.GetTodos());
        ArrayList<TodoExecutor> executors=new ArrayList<>();

        executors.add(new AddTodoExecutor());
        executors.add(new UpdateTodoExecutor());
        executors.add(new RemoveTodoExecutor());

        for (TodoExecutor executor : executors) {
            executor.Execute(raid,repo);
            System.out.println(repo.GetTodos());
        }
       // TodoRepository repo=new TodoRepository();
    }
}
