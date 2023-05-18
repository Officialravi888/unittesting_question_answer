package exe2;

public class Calculators extends ICalculator {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public int divison(int a, int b) throws Exception {
        return a/b;
    }

    @Override
    public boolean equalIntegers(int a, int b) {
        boolean result = false;

        if (a == b) {
            result = true;
        }

        return result;
    }
}