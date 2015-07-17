package com.pathashala;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void shouldReturnFizzIfNumberIsThree(){
        FizzBuzz fb = new FizzBuzz(3);
        String actualResult = FizzBuzz.multiple();
        assertEquals("fizz",actualResult);
    }
    @Test
    public void shouldReturnBuzzIfNumberIsFive(){
        FizzBuzz fb = new FizzBuzz(5);
        String actualResult = FizzBuzz.multiple();
        assertEquals("buzz",actualResult);
    }
    @Test
    public void shouldReturnFizzBuzzifMultipleOfThreeAndFive(){
        FizzBuzz fb = new FizzBuzz(15);
        String actualResult = FizzBuzz.multiple();
        assertEquals("fizzbuzz", actualResult);
    }


}
