package com.mypractice.Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyHandler handler = new MyHandler();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command (hi/bye): ");
        String input = scanner.nextLine();

        for (Method method : MyHandler.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Command.class)) {
                Command cmd = method.getAnnotation(Command.class);
                if (cmd.name().equalsIgnoreCase(input)) {
                    method.invoke(handler);
                    return;
                }
            }
        }
        System.out.println("Command not found");
    }
}
