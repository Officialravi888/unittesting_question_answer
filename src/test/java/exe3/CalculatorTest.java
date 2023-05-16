package exe3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private static Calculator cale=null;
    @BeforeAll
    public static void beforeAll(){
         cale=new Calculator();
    }
    @AfterAll
    public static void afterAll(){
        cale=null;
    }
    @Test
    void should_add_when() {
        Calculator cale=new Calculator();
        //given
        Integer actualResult=cale.add(12,54);
        Integer expectedResult=66;
        //when
        //then
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void should_multiply_when(){
        Calculator calc1=new Calculator();
        Integer actualResult=calc1.multiply(2,4);
        Integer expectedResult=8;
    }
}