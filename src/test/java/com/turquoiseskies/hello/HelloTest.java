package com.turquoiseskies.hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testHello() throws Exception {

        Hello hello = new Hello();
        String helloResult = hello.getHello();
        assertEquals("Hello", helloResult);
    }
}
