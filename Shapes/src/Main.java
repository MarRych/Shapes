import Quadrangle.Quadrangle;
import Quadrangle.Rectangle;
import Quadrangle.Square;
import Quadrangle.Romb;

import java.util.Objects;

//dziedziczenie
public class Main {
    public static void main(String[] args) {
        // Rectangle: 2.5 x 4
        Rectangle rectangle = new Rectangle(2.5,4);
        System.out.println("Rectangle field: " +rectangle.calculateField());

        //Square 3.5
        Square square = new Square(3.5);
        System.out.println("Square field: " +square.calculateField());
        System.out.println("Square's diagonal: " +square.calculateDiagonal());




        //złe boki;
    try{
        Rectangle rectangle1 = new Rectangle(0,10);
    }catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
        }


    //prosty polimirfizm
        Rectangle SquareWhichIsRectangle = new Square(3);
        System.out.println(SquareWhichIsRectangle.calculateField());
       // System.out.println(SquareWhichIsRectangle.calculateDiagonal());//teraz kwadrat jest tylko prostokątem


        //tablica czworokątów, uzywamy czowrokątów i możemy tylko obliczyć pole, klasa się może przydać w *klasie romb
        Quadrangle [] quadrangles = new Quadrangle[]{new Rectangle(3,3), new Square(2), new Romb(3,4)};
        for( Quadrangle c: quadrangles){
            System.out.println(c.calculateField());


        }
        System.out.println("wywołania " +Rectangle.value);




        Rectangle p1 = new Rectangle(5,10);
        Rectangle p2 = new Rectangle(5,10);
        System.out.println(p1.equals(p2));//true; testy hashcode zakomentowane wychodzi false
        System.out.println(p1==p2);//false inne miejsce w pamięci\

        Square s = new Square(6);
        System.out.println(s);
    }

}

