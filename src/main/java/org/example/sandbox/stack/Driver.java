package org.example.sandbox.stack;

public class Driver {
    public static void main(String[] args) {

        Stack<String> stack = new ArrayListStack<String>();

        System.out.println(stack.empty());

        stack.push("Hello");
        stack.push("Stack");
        stack.push("What's");
        stack.push("Up");

        System.out.println(stack);


    }
}
