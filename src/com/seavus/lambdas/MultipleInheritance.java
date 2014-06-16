package com.seavus.lambdas;

/**
 *
 * @author ijovicic
 */
public class MultipleInheritance {

    public interface InterfaceA {

        default void defaultMethod() {
            System.out.println("Interface A default method");
        }
    }

    public interface InterfaceB {

        default void defaultMethod() {
            System.out.println("Interface B default method");
        }
    }

    public class Impl implements InterfaceA, InterfaceB {

        public void defaultMethod() {
            InterfaceA.super.defaultMethod();
        }

    }

}
