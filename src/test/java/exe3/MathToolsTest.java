package exe3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MathToolsTest {
    @Test
    void should_test_return_true_when_ConvertToDecimalSuccess() {
        //given
        int a=3;
        int b=4;
        //when
        double result = MathTools.convertToDecimal(3, 4);
        //then
        Assertions.assertEquals(0.75, result);
    }
    @Test
    void testConvertToDecimalInvalidDenominator() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathTools.convertToDecimal(3, 0));
    }
}