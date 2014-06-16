package com.seavus.lambdas.scoping;

/**
 *
 * @author ijovicic
 */
public class HelloAnonymusClass {

    Runnable r1 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };
    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this.toString());
        }
    };

    public String toString() {
        return "Hello, world!";
    }
}
