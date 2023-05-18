package exe2;

public class BMICalculator {
        public double calculateBMI(double height, double weight) {
            return weight / (height * height);
        }

        public boolean isUnderweight(double bmi) {
            return bmi < 18.5;
        }

        public boolean isNormalWeight(double bmi) {
            return bmi >= 18.5 && bmi < 25;
        }
        public double calculatesBMI(double height, double weight) {
            if (weight <= 0) {
                throw new IllegalArgumentException("Weight must be a positive value");
            }
            return weight / (height * height);
        }
}
