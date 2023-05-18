package exe3;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

class CalculatorTest {
    @Test
    void testAssumeTrue() {
        boolean b = 'A' == 'A';
        assumeTrue(b);
        assertEquals("Hello", "Hello");
    }

    @Test
    @DisplayName("test executes only on Saturday")
    public void testAssumeTrueSaturday() {
        LocalDateTime dt = LocalDateTime.now();
        assumeTrue(dt.getDayOfWeek().getValue() == 6);
        System.out.println("further code will execute only if above assumption holds true");
    }

    @Test
    void testAssumeFalse() {
        boolean b = 'A' != 'A';
        assumeFalse(b);
        assertEquals("Hello", "Hello");
    }

    @Test
    void testAssumeFalseEnvProp() {
        System.setProperty("env", "prod");
        assumeFalse("dev".equals(System.getProperty("env")));
        System.out.println("further code will execute only if above assumption hold");
    }

    @Test
    void testAssumingThat() {
        System.setProperty("env", "test");
        assumingThat("test".equals(System.getProperty("env")),
                () -> {
                    assertEquals(10, 10);
                    System.out.println("perform below assertions only on the test env");
                });

    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("**--- beforeAll :: Executed once before all test methods ---**");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("**--- beforeEach :: Executed before each test method ---**");
    }

    @AfterEach
    void afterEach() {
        System.out.println("**--- afterEach :: Executed after each test method ---**");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("**---afterAll :: Executed after all test method ---**");
    }

    @Nested
    class InnerClass {

        @BeforeEach
        void beforeEach() {
            System.out.println("**--- Executed before each test method ---**");
        }

        @AfterEach
        void afterEach() {
            System.out.println("**--- Executed after each test method ---**");
        }

        @Test
        void testMethod1() {
            System.out.println("**--- testMethod1 :: Executed test method1 ---**");
        }

        @Nested
        class InnerMostClass {

            @BeforeEach
            void beforeEach() {
                System.out.println("**--- Executed before each test method ---**");
            }

            @AfterEach
            void afterEach() {
                System.out.println("**--- Executed after each test method ---**");
            }

            @Test
            void testMethod2() {
                System.out.println("**--- Executed test method2 ---**");
            }
        }
    }
}