package demoapplication;

import org.junit.jupiter.api.*;

public class AccountTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach ");
    }


    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        System.out.println("testSingleSuccessTest");
    }

    @Test
    @Disabled("Not implemented yet")
    void testShowSomething() {
    }



}
