package org.example;

import static java.lang.System.out;

import org.example.packageone.ClassOne;
import org.example.packagethree.ClassThree;
import org.example.packagetwo.ClassTwo;

public class MainLab {
    public static void main(String[] args) {

        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();

        out.println(classOne.greet());
        out.println(classTwo.greet());
        out.println(classThree.greet());
      
    }
}