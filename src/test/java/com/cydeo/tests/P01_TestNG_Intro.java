package com.cydeo.tests;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class P01_TestNG_Intro {
    @Test
    public void testOnePlusFive(){

        assertEquals(1+5,6);

    }

    @Test
    public void testTenMinusFour() {

        assertEquals(10 - 4, 6);
    }
        @BeforeClass
                public void setUp(){
            System.out.println("Before Class is running");
        }

        @AfterClass
                public void tearDown(){
            System.out.println("After class is Running");
        }

        @BeforeMethod
    public void setUpMethod(){
            System.out.println("Before method is running");
        }
        @AfterMethod
    public void tearDownMethod(){
            System.out.println("After Method is Running ");
        }
    }

