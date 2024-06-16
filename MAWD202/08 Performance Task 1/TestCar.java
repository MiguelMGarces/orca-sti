
// TestCar.java
public class TestCar {
    public static void main(String[] args) {
        // Initial Values
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars manufactured: " + Car.numCars);

        // Instantiating first car object
        Car car1 = new Car("Camry");
        System.out.println(car1);

        // Instantiating second car object
        Car car2 = new Car("Veloz");
        System.out.println(car2);

        // Total number of cars manufactured
        System.out.println("Number of cars manufactured: " + Car.numCars);
    }
}
