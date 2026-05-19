import java.math.BigDecimal;


/**
 * B01_Main — Entry point for Lab 3: Interfaces and Abstract Classes.
 * Runs demonstrations for all four sections.
 */
public class B01_Main {

    public static void main(String[] args) {

        // Section 1: BigDecimal Operations
        System.out.println("=== BigDecimal Operations ===");
        BigDecimal val1 = new BigDecimal("4.2545");
        BigDecimal val2 = new BigDecimal("1.2345");
        BigDecimal val3 = new BigDecimal("-45.67");
        System.out.println(B02_BigDecimalUtils.roundToHundredth(val1));   // 4.25
        System.out.println(B02_BigDecimalUtils.negateAndRoundToTenth(val2)); // -1.2
        System.out.println(B02_BigDecimalUtils.negateAndRoundToTenth(val3)); // 45.7

        // Section 2: Car Inventory System
        System.out.println("\n=== Car Inventory System ===");
        B04_Sedan sedan = new B04_Sedan("1HGCM82633A123456", "Honda", "Civic", 45000);
        B05_UtilityVehicle suv = new B05_UtilityVehicle("2T1BURHE0JC123456", "Toyota", "RAV4", 30000, true);
        B06_Truck truck = new B06_Truck("3GCUKREC0EG123456", "Chevrolet", "Silverado", 60000, 12000.0);
        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());

        // Section 3: Video Streaming Service
        System.out.println("\n=== Video Streaming Service ===");
        B08_TvSeries series = new B08_TvSeries("Breaking Bad", 2700, 62);
        B09_Movie movie = new B09_Movie("Inception", 148, 8.8);
        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());

        // Section 4: IntList Interface
        System.out.println("\n=== IntList Interface ===");
        B11_IntArrayList arrayList = new B11_IntArrayList();
        B12_IntVector vector = new B12_IntVector();

        for (int i = 0; i < 12; i++) {
            arrayList.add(i * 10);
            vector.add(i * 5);
        }

        System.out.println("IntArrayList element at index 5: " + arrayList.get(5));
        System.out.println("IntVector element at index 5: " + vector.get(5));
    }
}