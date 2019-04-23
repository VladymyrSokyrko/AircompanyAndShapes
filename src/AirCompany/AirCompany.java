package AirCompany;

import java.util.ArrayList;

public class AirCompany {
    private String name;
    private ArrayList <Flight> flights = new ArrayList<>();


    public AirCompany () {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void add (Flight flight){
        flights.add(flight);
   }

   public double profit (){
        double profit = 0.0;
        for (Flight flight: flights){
            profit += flight.getProfit ();
        }
        return profit;
   }
}
