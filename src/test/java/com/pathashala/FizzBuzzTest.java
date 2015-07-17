package com.pathashala;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void shouldReturnFizzIfNumberIsThree(){
        FizzBuzz fb = new FizzBuzz(3);
        String actualResult=FizzBuzz.multiple();
        assertEquals("fizz",actualResult);
    }


}
