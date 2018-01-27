package com.turquoiseskies.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void testHello() {
        Hello hello = new Hello();
        String helloResult = hello.getHello();
        assertEquals("Hello", helloResult);
    }
}
