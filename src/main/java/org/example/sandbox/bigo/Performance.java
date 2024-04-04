package org.example.sandbox.bigo;

import java.util.ArrayList;
import java.util.List;

public class Performance {

    public static void main(String[] args) {
        // O(1) - constant
        System.out.println("one");
        System.out.println("two");

        // O(1) + O(1) = O(1)

        // O(n) - linear

        List<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");

        // O(n)
        myList.forEach(System.out::println);

        // O(n^2) - polynomial
        for(int x = 0; x <= 10000; x++) { // O(n)
            for(int y = 0; y <= 10000; y++) { // O(n)
                System.out.println(x + ":" + y); // O(1)
            }
        }

        // O(n) * O(n) * O(1) = O(n^2) * O(1) = 1 * O(n^2) = O(n^2)

        // O(n)
        for (int n = 0; n <= 10000; n++) {
            // O(1)
        }

    }
}
