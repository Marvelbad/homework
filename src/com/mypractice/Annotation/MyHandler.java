package com.mypractice.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Command {
    String name();
}

public class MyHandler {
    @Command(name = "hi")
    public void sayHi() {
        System.out.println("Hello, Badri");
    }

    @Command(name = "bye")
    public void sayBye() {
        System.out.println("Bye, Badri");
    }
}
