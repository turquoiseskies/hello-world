package com.turquoiseskies.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleControllerTest {

    @Test
    public void main() {
        SampleController.main(new String[]{"--spring.main.web-environment=false"});
    }

    @Test
    public void home() {
        SampleController sampleController = new SampleController();
        assertEquals("Hello World!", sampleController.home());
    }
}