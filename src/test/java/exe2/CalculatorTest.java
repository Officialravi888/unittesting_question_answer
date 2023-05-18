package exe2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void should_return_true_when_evaluate() {
        Calculator calculator=new Calculator();
        int sum=calculator.evaluate("1+6+9+8");
        //then
        assertEquals(24,sum);
    }
    @Test
    void should_return_not_equals_when_evaluate(){
        //given
        Calculator calculator=new Calculator();
        // when
        int sum=calculator.evaluate("2+3+4");
        //then
        assertNotEquals(10,sum);
    }
    @Test
    void should_return_when_true_evaluate(){

    }
}