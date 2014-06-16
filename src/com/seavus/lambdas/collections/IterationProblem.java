package com.seavus.lambdas.collections;

import java.util.List;

/**
 *
 * @author ijovicic
 */
public class IterationProblem {

    public void externalIteration(List<Button> buttons) {
        for (Button button : buttons) {
            if (button.getColor().equals("RED")) {
                button.setColor("BLUE");
            }
        }
    }

    public void internalIteration(List<Button> buttons) {
        buttons.forEach(s -> {
            if (s.getColor().equals("RED")) {
                s.setColor("BLUE");
            }
        });
    }
}
