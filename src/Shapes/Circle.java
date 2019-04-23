package Shapes;

public class Circle extends Dot {

  protected int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    double Perimeter (){
        return 2 * Math.PI * radius;
    }
}
