package com.cydeo.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class P01_TestNG_Intro {
    @Test
    public void testOnePlusFive(){

        assertEquals(1+5,6);

    }

    @Test
    public void testTenMinusFour(){

        assertEquals(10-4,6);
    }
}
