package com.WowTodoConsoleApp;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
	// write your code here
      //  Scanner s = new Scanner(System.in);
        TodoBase raid=new RaidTodo();
        System.out.println(raid);
        TodoBase mythicDungoenTodo=new MythicDungoenTodo();
        System.out.println(mythicDungoenTodo);
        ArrayList<TodoBase> todos=new ArrayList<TodoBase>();
        todos.add(raid);
        todos.add(mythicDungoenTodo);
        TodoBase raid2=new RaidTodo();
        System.out.println(todos);
        boolean result=todos.contains(raid);
        raid.setName("test2");
        TodoBase clone=(TodoBase)raid.clone();
        clone.setName("test3");
        System.out.println(result);
       // TodoRepository repo=new TodoRepository();
    }
}
