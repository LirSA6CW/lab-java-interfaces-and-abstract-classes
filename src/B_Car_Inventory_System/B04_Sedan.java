/**
 * B04_Sedan — Represents a sedan car. Extends B03_Car.
 * No additional properties beyond the base Car class.
 */
public class B04_Sedan extends B03_Car {

    public B04_Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "Sedan{" +
                "vin='" + getVinNumber() + '\'' +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                '}';
    }
}
