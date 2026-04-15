package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSumOfDigits() {
        int result = App.sumOfDigits(123);
        assertEquals(6, result);
    }
}