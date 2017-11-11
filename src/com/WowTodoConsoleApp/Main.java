package com.WowTodoConsoleApp;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
      //  Scanner s = new Scanner(System.in);
        TodoBase obj=new RaidTodo();
        System.out.println(obj);
        TodoBase obj2=new RaidTodo();
        System.out.println(obj2);
        System.out.println(obj.equals(obj2));
       // TodoRepository repo=new TodoRepository();
    }
}
