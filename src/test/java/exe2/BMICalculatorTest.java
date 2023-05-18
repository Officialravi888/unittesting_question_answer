package exe2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void should_assert_equals_when_calculateBMI() {
        //given
        BMICalculator obj=new BMICalculator();
        Integer height=12;
        Integer weight=50;
        Integer expectedBMI=22;
        //when
        Integer result=obj.calculateBMI(height,weight);
        //then
        assertEquals(expectedBMI,result,22);
    }

    @Test
    void should_assert_not_equals_when_calculateBMI() {
        //given
        BMICalculator bmiCalculator=new BMICalculator();
        Integer height= 1;
        Integer weight=70;
        Integer expectedBMI= 26;
        //when
        Integer result=bmiCalculator.calculateBMI(height,weight);
        //then
        assertNotEquals(expectedBMI,result,26);
    }

    @Test
    void should_assert_true_when_isUnderweight() {
        //given
        BMICalculator bmiCalculator=new BMICalculator();
        Integer bmi=17;
        //when
        boolean result=bmiCalculator.isUnderweight(bmi);
        //then
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(ints={2,3,5,6,7,8,9})
    void should_assert_return_true_multiply_value_when_isUnderweight(Integer coreBmi) {
        BMICalculator bmiCalculator=new BMICalculator();
        Integer bmi=coreBmi;
        boolean result=bmiCalculator.isUnderweight(bmi);
        assertTrue(result);
    }
}