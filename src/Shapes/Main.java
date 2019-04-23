package Shapes;

public class Main {

    public static void main(String[] args) {
        Dot d = new Sector(5,7,15, 75);
        Dot first = new Dot(17,15);
        Circle c = new Circle(first.getX(), first.getY(), 20);

        Sector s = new Sector(first.getX(), first.getY(),c.radius,80);

        double length = s.sectorLength();
        double square = s.sectorSquare();
        double perimeter = s.Perimeter();

        System.out.println(length);
        System.out.println();
        System.out.println(square);
        System.out.println();
        System.out.println(perimeter);

    }

}
