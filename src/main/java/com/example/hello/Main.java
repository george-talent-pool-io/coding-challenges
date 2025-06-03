/**
 * A simple Hello World program using Java 21 features.
 */
package com.example.hello;

public class Main {
    public static void main(String[] args) {
        // Using Java 21's String templates (preview feature)
        String name = "World";

        // Using traditional string concatenation for compatibility
        System.out.println("Hello, " + name + "!");

        // Alternatively, if String templates are enabled with --enable-preview flag:
        // System.out.println(STR."Hello, \{name}!");

        // Demonstrating Java 21's switch expression with pattern matching
        Object obj = "Hello Java 21";
        String result = switch (obj) {
            case String s when s.length() > 10 -> "Long string: " + s;
            case String s -> "Short string: " + s;
            case Integer i -> "Integer: " + i;
            default -> "Unknown object";
        };

        System.out.println(result);

        // Testing the FizzBuzz implementation
        System.out.println("\nFizzBuzz Test (n=15):");
        Result.fizzBuzz(15);
    }
}
