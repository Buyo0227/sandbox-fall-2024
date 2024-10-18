package com.sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruit implements Comparable<Fruit> {
    private String Fruitname;
    private int QTY;
    private int weight;

    public Fruit(String name, int QTY, int weight) {
        this.Fruitname = name;
        this.QTY = QTY;
        this.weight = weight;
    }

    public String getName() {
        return Fruitname;
    }

    public int getQTY() {
        return QTY;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return Fruitname + " " + QTY + " " + weight;
    }
    @Override
    public int compareTo(Fruit that) {
        if(this.Fruitname.compareTo(that.Fruitname)>0) {
            return 1;
        }else if (this.Fruitname.compareTo(that.Fruitname)<0) {
            return -1;
        }else {
            if (this.QTY > that.QTY) {
                return 1;
            } else if (this.QTY < that.QTY) {
                return -1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 5, 10);
        Fruit orange = new Fruit("Orange", 10, 20);
        Fruit apple2 = new Fruit("Apple", 10, 20);
        Fruit banana = new Fruit("Banana", 15, 30);
        Fruit orange2 = new Fruit("Orange", 5, 10);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(apple);
        fruits.add(apple2);
        fruits.add(orange);
        fruits.add(orange2);
        fruits.add(banana);

        fruits.forEach(System.out::println);
        System.out.println();
        System.out.println("After sorting...");
        System.out.println();

        Collections.sort(fruits);
        fruits.forEach(System.out::println);

    }
}
