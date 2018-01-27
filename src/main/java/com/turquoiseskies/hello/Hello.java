package com.turquoiseskies.hello;

class Hello {

    private static final String HELLO_RETURN = "Hello";

    @SuppressWarnings("SameReturnValue")
    String getHello(){
        return HELLO_RETURN;
    }
}
