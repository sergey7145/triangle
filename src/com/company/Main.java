package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.print();
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите стороны треугольника");
        a = scanner.nextInt();
        b = scanner.nextInt();
        Triangle triangle1 = new Triangle(a, b);
        triangle1.print();

    }
}
