package exe2;

public class BMICalculator {
        public Integer calculateBMI(Integer height, Integer weight) {
            return weight / (height * height);
        }

        public boolean isUnderweight(Integer bmi) {
            return bmi < 18;
        }

        public boolean isNormalWeight(Integer bmi) {
            return bmi >= 18.5 && bmi < 25;
        }
        public Integer calculatesBMI(Integer height, Integer weight) {
            if (weight <= 0) {
                throw new IllegalArgumentException("Weight must be a positive value");
            }
            return weight / (height * height);
        }
}
