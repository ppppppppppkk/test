package day15;

public class Step1 { // c s
    public static void main(String[] args) { // m s

        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    } // m e
}// c e
