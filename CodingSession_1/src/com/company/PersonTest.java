package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTest{

    @Test
    public void shouldReturnHelloWorld(){

        Person Pavel = new  Person();
        assertEquals("Hello World", Pavel.helloWorld());

    }


}

