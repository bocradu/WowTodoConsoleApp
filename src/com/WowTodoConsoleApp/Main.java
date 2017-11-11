package com.WowTodoConsoleApp;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
      //  Scanner s = new Scanner(System.in);
        TodoBase raid=new RaidTodo();
        System.out.println(raid);
        TodoBase mythicDungoenTodo=new MythicDungoenTodo();
        System.out.println(mythicDungoenTodo);
        ArrayList<TodoBase> todos=new ArrayList<TodoBase>();
        todos.add(raid);
        todos.add(mythicDungoenTodo);
        System.out.println(todos);
       // TodoRepository repo=new TodoRepository();
    }
}
