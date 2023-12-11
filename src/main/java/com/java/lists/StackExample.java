package com.java.lists;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Harry Potter");
        books.push("Lord of the Rings");
        books.push("Game of Thrones");
        System.out.println(books); // [Harry Potter, Lord of the Rings, Game of Thrones]
        books.pop();
        System.out.println(books); // [Harry Potter, Lord of the Rings]
    }
}
