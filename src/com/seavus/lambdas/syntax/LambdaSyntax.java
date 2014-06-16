package com.seavus.lambdas.syntax;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author ijovicic
 */
public class LambdaSyntax {
    public interface HelloWordFI {
        int sum(int a, int b);
    }
    
    public interface Constants {
        double getPi();
    }
    
    public void parametherRules(){
        //two parameters enclosed in parentheses 
        HelloWordFI helloWordFI = (int a, int b) -> {
            return a + b;
        };
        //type inferred from the context
        HelloWordFI helloWordFI2 = (a, b) -> {
            return a + b;
        };
        //zero parameters
        Constants constants = () -> {
            return 3.1415;
        };
        //not mandatory to use parentheses
        ActionListener actionListener = (ActionEvent event) -> System.out.println("button clicked");
    }
    
    public void bodySyntax() {
        //Single expression
        Predicate<String> function = (String input) -> input.equals("y");
        Function<Item, Integer> functionItem = (Item item) -> item != null ? item.getNo() : -1;

        //single statement
        Consumer<String> consumer = (String input) -> {
            System.out.println(input);
        };

        //block statement
        Consumer<Item> blockStatement = (Item i) -> {
            if (i == null) {
                i = new Item();
            }
            System.out.println(i.getInfo());
        };
    }
}
