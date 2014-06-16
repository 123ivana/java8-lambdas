package com.seavus.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ijovicic
 */
public class MethodReference {
    
    class Person { 
    private String name;
    private int age;
    public int getAge() { return age; }
    public String getName() { return name; }
}

    public void compare() {
        Person[] persons = new Person[10];
        Comparator<Person> compareByName = Comparator.comparing(p -> p.getName());
        Arrays.sort(persons, compareByName);
       
        //comparator using method reference
        Comparator<Person> compareByNameMR = Comparator.comparing(Person::getName);
        Arrays.sort(persons, compareByNameMR);
    }

}
