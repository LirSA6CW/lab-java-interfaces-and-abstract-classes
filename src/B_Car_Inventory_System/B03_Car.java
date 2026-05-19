/**
 * B03_Car — Abstract base class for all car types in the inventory system.
 * Section 2 of the lab.
 * Subclasses: B04_Sedan, B05_UtilityVehicle, B06_Truck
 */
public abstract class B03_Car {

    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public B03_Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    // --- Getters and Setters ---

    public String getVinNumber() { return vinNumber; }
    public void setVinNumber(String vinNumber) { this.vinNumber = vinNumber; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }

    /**
     * Returns a readable string with all car properties.
     * Each subclass must implement this method.
     */
    public abstract String getInfo();
}