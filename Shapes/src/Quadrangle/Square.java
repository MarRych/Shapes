package Quadrangle;

import org.w3c.dom.ls.LSOutput;

public class Square extends Rectangle{
    //kwadrat dziedziczy po prostokącie
    //konstruktor wywołujące klasy funkcji bazowej

    public Square(double a){
        super(a,a); //konstruktor wywołujący klasę bazową


        }
    public double calculateDiagonal(){
    return getA()*Math.sqrt(2.0); //getA= pobierz długość boku b który jest prywatny


    }


}
