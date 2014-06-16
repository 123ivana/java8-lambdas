package com.seavus.lambdas;

import java.util.Comparator;
import java.util.concurrent.Callable;

/**
 *
 * @author ijovicic
 */
public class TargetTyping {
    
    public interface PrintHelper {

        String printDone();
    }

    public void typeDependsOnContext() {
        //same lambda expresions different types
        Callable<String> callable = () -> "done";
        PrintHelper timeUtil = () -> "done";

        //inferred lambda parameters' types to be 
        Comparator<String> comparator = (s1, s2) -> s1.compareToIgnoreCase(s2);

        //target type is the type being assigned to
        Comparator<String> c;
        c = (String s1, String s2) -> s1.compareToIgnoreCase(s2);

    }

    public Runnable returnLater() {
        //target type is the type returned
        return () -> {
            System.out.println("later");
        };
    }

}
