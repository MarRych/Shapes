package Quadrangle;

public class Romb implements Quadrangle{


private double a,h;
 public Romb (double a, double h){
     this.a = a;
     this.h = h;
 }

    @Override
    public double calculateField() {
        return a * h;
    }

//klasa abstrakcyjna
// interface nie ma implementacji metod
/*pole statyczne "static" nie jest właśnośćą obiektów ale wspólne dla całej klasy
stosowany do baz danych, numery Id
-static final nazwa CAPSLOCK;
-jeżeli używamy czegoś statycznego to w środku wszytsko musi być statyczne
-Math.SQRT statyczne
-int arg0; args.length - cos co jest podobne do tablicy ale wywołanie jest inne Sout(2,1,3,4,5,)
-wszystko dziedziczy po obiect
hashCode()-porównuje dwa obiekty ich hash kody
nie kozystamy z double do cen i pieniędzy
nie porównujemy double bezpośrednio ze sobą, ewentualnie większa czy mniejsza, przyjmujemy epsilon czyli margines błędu
a=a to 0,jeżeli mniejsze -1, jesli większe to 1
   */
    }



