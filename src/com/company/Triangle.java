package com.company;

public class Triangle {
    private final int a, b;

    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Triangle() {
        a = 5;
        b = 7;
    }

    public int Hypotenuse() {
        return (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public int Square() {
        return a * b;
    }

    public void print() {
        System.out.println("первая сторона = " + a + "\n" +
                "вторая сторона = " + b + "\n" + "третья сторона = " +
                Hypotenuse());

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
