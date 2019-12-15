package com.example.lambda;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaApplication {

    public static void main(String[] args) {
        MyInterface1 myInterface1 = () -> System.out.println("This methods executes using lambda...");
        myInterface1.method1();

        System.out.println("------------------------------------");

        MyInterface2 myInterface2 = (String name) -> System.out.println("Your name is:" + name);
        myInterface2.method2("Sean Murphy");

        System.out.println("------------------------------------");

        MyInterface3 myInterface3 = (String name, int age) -> {
            System.out.println("Your name is: " + name);
            System.out.println("You are " + age + " years Old...");
        };

        myInterface3.method3("Andrew", 30);
    }

}
