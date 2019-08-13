package com.seavus.lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ijovicic
 */
public class AnonymusClassProblem {
    
    public JButton addJButtonAnonymusClass() {
        JButton button = new JButton("Test Button");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("Button clicked");
            }
        });
        return button;
    }


    public JButton addJButtonLambdas() {
        JButton button = new JButton("Test Button");
        button.addActionListener(event -> System.out.println("button clicked"));
        return button;
    }
}
