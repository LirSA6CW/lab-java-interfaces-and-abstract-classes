import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * B02_BigDecimalUtils — Utility methods for BigDecimal operations.
 * Section 1 of the lab.
 */
public class B02_BigDecimalUtils {

    /**
     * Rounds a BigDecimal to the nearest hundredth (2 decimal places).
     * Example: 4.2545 -> 4.25
     * @param value the BigDecimal to round
     * @return a double rounded to 2 decimal places
     */
    public static double roundToHundredth(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Reverses the sign of a BigDecimal and rounds it to the nearest tenth (1 decimal place).
     * Example: 1.2345 -> -1.2 | -45.67 -> 45.7
     * @param value the BigDecimal to negate and round
     * @return a BigDecimal with reversed sign rounded to 1 decimal place
     */
    public static BigDecimal negateAndRoundToTenth(BigDecimal value) {
        return value.negate().setScale(1, RoundingMode.HALF_UP);
    }
}