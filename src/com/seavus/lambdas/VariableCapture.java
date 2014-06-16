package com.seavus.lambdas;

import javax.swing.JButton;

/**
 *
 * @author ijovicic
 */
public class VariableCapture {
    
    public void capturingVariable() {
        String name = getUserName();
        JButton button = new JButton();
        button.addActionListener(event -> System.out.println("hi " + name));
    }
    
    public void capturingVariableError() {
        //fails to compile
        String name = getUserName();
        name = formatUserName(name);
        JButton button = new JButton();
        button.addActionListener(event -> System.out.println("hi " + name);
    }

    private String getUserName() {
        return "Test";
    }

    private String formatUserName(String name) {
        return name.toLowerCase();
    }
}
