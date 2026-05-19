/**
 * B06_Truck — Represents a truck. Extends B03_Car.
 * Additional property: towingCapacity (double)
 */
public class B06_Truck extends B03_Car {

    private double towingCapacity;

    public B06_Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() { return towingCapacity; }
    public void setTowingCapacity(double towingCapacity) { this.towingCapacity = towingCapacity; }

    @Override
    public String getInfo() {
        return "Truck{" +
                "vin='" + getVinNumber() + '\'' +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                ", towingCapacity=" + towingCapacity +
                '}';
    }
}