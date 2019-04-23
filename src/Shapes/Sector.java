package Shapes;


public class Sector extends Circle {
    protected int angle;


    Sector(int x, int y, int radius, int angle) {
        super(x, y, radius);
        if (radius>0||radius<=360){
            this.angle = angle;
        }
//        else throw NumberFormatException e ("incorrect number");

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
