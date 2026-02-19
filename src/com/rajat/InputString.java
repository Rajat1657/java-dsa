package com.rajat;

import java.util.Scanner;

public class InputString {
    static void main() {
        System.out.println("What is you name? \n");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(); // Used to take in the whole string
//    String name = input.next(); // Used to input just the first word
        System.out.println("Hello " + name + "!!");
        input.close();
    }
}
