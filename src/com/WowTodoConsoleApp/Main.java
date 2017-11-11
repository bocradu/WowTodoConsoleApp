package com.WowTodoConsoleApp;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.print(s.next());
        TodoRepository repo=new TodoRepository();
    }
}
