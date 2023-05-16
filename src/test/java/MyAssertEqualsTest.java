import exe2.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAssertEqualsTest {
    @Test
    public void should_mySimpleEqualsTest_when(){
        //given
        String expectedName = "Nattu";
        //when
        //then
        assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
    }
    @Test
    public void myObjectEqualsTest(){

        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
    }
}
