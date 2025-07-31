package org.example;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

import static java.lang.System.out;

public class MainLab {
    public static void main(String[] args) {

        println(ClassOne.greet());
        println(ClassTwo.greet());
        println(ClassThree.greet());
      
    }
}