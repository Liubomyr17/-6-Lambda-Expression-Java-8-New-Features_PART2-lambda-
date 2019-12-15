package com.example.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

//        createThreadWithoutLambda();
        createThreadUsingLambda();
    }

    private static void createThreadUsingLambda() {
        Runnable r = () -> System.out.println("My is executing..");
        Thread thread1 = new Thread(r);
        thread1.start();
    }

    private static void createThreadWithoutLambda() {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        thread1.start();
    }
}
