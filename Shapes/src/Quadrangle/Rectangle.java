package Quadrangle;

import java.util.Objects;

public class Rectangle implements Quadrangle {
    //klasa bazowa,
    private double a,b;

    public static int value = 0;//liczba wywołań

    //konstruktor prywatny
    public Rectangle(double a, double b){
        value++;
        //sprawdzamy czy boki to ujemne wartosci
        if (a<=0 || b <0){
            throw new IllegalArgumentException("Sides can not be negative.");
        }
        this.a = a;
        this.b = b;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //metoda
    @Override
    public  double calculateField(){
        return a*b; //return można modyfikować w bardzie skąplikowanym kodzie niż sout

    }
//hashCode porównuje wartości i obiekty
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
    @Override
    public String toString(){
        return"Rectangle sides"+a+"x"+b;
    }

    }

