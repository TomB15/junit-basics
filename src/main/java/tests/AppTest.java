package main.java.tests;

import main.java.App;
import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class AppTest {

    @BeforeEach
    void setUp() {
        System.out.println("A test has started.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("A test has finished.");
    }

    @Test
    @DisplayName("MySumTest")
    void sum() {
        int a = 1;
        int b = 2;

        int expected = a + b;
        int actual = new App().sum(a,b);

        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        Random rand = new Random();

        double a = rand.nextInt(10);
        double b = rand.nextInt(10);

        assumeTrue(b != 0);

        double expected = a / b;
        double actual = new App().divide(a,b);

        assertEquals(expected, actual);
    }

    @Disabled
    @Test
    void ignoreMe() {
        //invalid test
    }

    void iAmNotATest() {

    }
}