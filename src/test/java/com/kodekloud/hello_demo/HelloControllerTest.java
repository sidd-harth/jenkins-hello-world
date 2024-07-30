package com.kodekloud.hello_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {

    private final HelloDemoApplication helloController = new HelloDemoApplication();

    @Test
    public void testHello() {
        String expected = "Hello KodeKloud Users!";
        String actual = helloController.hello();
        assertEquals(expected, actual);
    }

    // Additional test cases (you can add more as needed)
    @Test
    public void testHelloWithDifferentGreeting() {
        // Modify the hello() method to return a different greeting
        // and assert the new expected value
    }

    @Test
    public void testHelloWithNullReturn() {
        // Modify the hello() method to return null
        // and assert an appropriate exception or message
    }

    @Test
    public void testHelloWithEmptyReturn() {
        // Modify the hello() method to return an empty string
        // and assert an appropriate exception or message
    }

    @Test
    public void testHelloWithException() {
        // Modify the hello() method to throw an exception
        // and assert that the exception is thrown
    }
}