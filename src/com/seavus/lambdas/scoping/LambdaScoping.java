package com.seavus.lambdas.scoping;

/**
 *
 * @author ijovicic
 */
public class LambdaScoping {

    public static void main(String... args) {
        new HelloAnonymusClass().r1.run();
        new HelloAnonymusClass().r2.run();
        //Results Hello$1@f7ce53
        //this - - > Hello.this
        //this - - > Hello.this.toString()
        
        new HelloLambda().r1.run();
        new HelloLambda().r2.run();
        //result Hello, world!

    }

}
