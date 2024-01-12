package CarRentalSystem;

public class Main{
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C1", "BMW", "X5", 60.0); // Different base price per day for each car
        Car car2 = new Car("C2", "Nissan", "GTR", 70.0);
        Car car3 = new Car("C3", "Toyota", "Supra", 150.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}
