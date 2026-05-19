/**
 * B05_UtilityVehicle — Represents a utility vehicle (SUV). Extends B03_Car.
 * Additional property: fourWheelDrive (boolean)
 */
public class B05_UtilityVehicle extends B03_Car {

    private boolean fourWheelDrive;

    public B05_UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() { return fourWheelDrive; }
    public void setFourWheelDrive(boolean fourWheelDrive) { this.fourWheelDrive = fourWheelDrive; }

    @Override
    public String getInfo() {
        return "UtilityVehicle{" +
                "vin='" + getVinNumber() + '\'' +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                ", fourWheelDrive=" + fourWheelDrive +
                '}';
    }
}