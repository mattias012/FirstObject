/*1.
        Skapa en klass Rectangle enligt nedan samt skriv ett program som använder din Rectangle-klass
        har fyra instansvariabler: x, y, width och height
        har tre konstruktörer
        en som inte tar emot ngt och som sätter alla instansvariabler till 0
        en som tar emot två värden som sätts in i width och height medan x och y sätts till 0
        en som tar emot fyra värden som används för att sätta de fyra instansvariablerna
        en instansmetod calculateArea som returnerar en double med rektangelns area
        en instansmetod calculatePerimeter som returnerar en double med rektangelns omkrets
        en instansmetod setXY som låter dig sätta instansvariablerna x och y
        två instansmetoder setWidth och setHeight som låter dig sätta motsvarande instansvariabler */

public class Main {
    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        int height = 4;
        int width = 5;


        //Create rectangle
        Rectangle myFirstRectangle = new Rectangle(x, y, height, width);

        //don't need to pass arguments?
        double area = myFirstRectangle.calculateArea();
        System.out.println(area);

        //print this objects circumference
        double circ = myFirstRectangle.calculatePerimeter(x, y, height, width);
        System.out.println(circ);

        //Set new x and y
        myFirstRectangle.setXY(3, 4);
        System.out.println("x: " + myFirstRectangle.getX() + " y: " + myFirstRectangle.getY());

        int newHeight = 11;
        int newWidth = 12;
        myFirstRectangle.setHeightandWidth(newHeight, newWidth);
        System.out.println("Height: "+ myFirstRectangle.getHeight() + " width: " + myFirstRectangle.getWidth());

    }
}