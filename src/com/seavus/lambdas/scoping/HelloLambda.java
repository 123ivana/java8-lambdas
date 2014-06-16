package com.seavus.lambdas.scoping;

/**
 *
 * @author ijovicic
 */
public class HelloLambda {

    Runnable r1 = () -> {
        System.out.println(this);
    };
    Runnable r2 = () -> {
        System.out.println(toString());
    };

    public String toString() {
        return "Hello, world!";
    }

}
