import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void should_return_true_when_diet_recommended() {
        //given
        double weight = 88.5;
        double height =1.52;
        //when
        boolean recommended = CalculatorTest.isDietRecommended(weight,height);
        //then
        assertTrue(recommended);
    }
    @Test
    public void should_throw_ArithmeticException_when_height_zero(){
        // given
        double weight = 50.1;
        double height =0.0;
        // when
//        Executable executable =  () -> CalculatorTest.isDietRecommended(weight,height);
//
//        // then
//        assertThrows(ArithmeticException.class,executable);
    }
    @Test
    public void should_return_null_when_coderList_empty(){
        //Given
        List<Coder> coders = new ArrayList<>();

        // When
        Coder coderWithWorstBMI = CalculatorTest.findCoderWithWorstBMI(coders);
        // Then
        assertNull(coderWithWorstBMI);


    }

    private static Coder findCoderWithWorstBMI(List<Coder> coders) {
        return null;
    }

    private static boolean isDietRecommended(double weight, double height) {
        return false;
    }

}