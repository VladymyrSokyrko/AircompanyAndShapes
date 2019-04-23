package Shapes;


public class Sector extends Circle {
    private int angle;


    Sector(int x, int y, int radius, int angle) {
        super(x, y, radius);
        if (radius>0 && radius<=360){
            this.angle = angle;
            return;
        }
        throw new IncorrectNumberException();

    }

//    private void e(String incorrect_number) {
//    }


    public double sectorLength (){
        return angle * radius;
    }

   public double sectorSquare () {
        return 0.5 * Math.pow(2,radius) * (angle - Math.sin(angle));
    }
}
