package AirCompany;

public class Main {
    public static void main(String[] args) {
        AirCompanyFactory factory = new AirCompanyFactory();
        AirCompany airCompany = factory.createAircompany();
        double profit = airCompany.profit();

        System.out.println(profit);

    }
}
