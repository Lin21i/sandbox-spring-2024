package org.example.sandbox.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitDriver {

    public static void main(String[] args) {

        Fruit apple = new Fruit("Apple", 100);
        Fruit orange = new Fruit("Orange", 50);
        Fruit banana = new Fruit("Banana", 50);
        Fruit peach = new Fruit("Peach", 200);
        Fruit apple2 = new Fruit("Apple", 50);
        Fruit tangerine = new Fruit("Tangerine", 50);

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(apple);
        fruits.add(orange);
        fruits.add(banana);
        fruits.add(peach);
        fruits.add(apple2);
        fruits.add(tangerine);

        fruits.forEach(System.out::println);

        Collections.sort(fruits);
        List<Fruit> reversed = fruits.reversed();

        System.out.println();

        fruits.forEach(System.out::println);
        System.out.println();
        reversed.forEach(System.out::println);

    }
}
