package HW1;

public class Car extends Vehicle{
    public Car(String name, double price) {
        super(name, price);
    }

    @Override
    public double totalBeforeTax(Vehicle vehicle) {
        return super.totalBeforeTax(vehicle);
    }

    @Override
    public double calcTax(Vehicle vehicle) {
        return super.calcTax(vehicle);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        super.totalAfterTax(vehicle);
    }
}
