package exe3;

public class MathTools {
    public static double convertToDecimal(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b must not be 0");
        }
        return (double)a / (double)b;
    }
}
