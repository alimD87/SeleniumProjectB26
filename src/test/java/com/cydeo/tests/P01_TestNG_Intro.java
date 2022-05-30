package com.cydeo.tests;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class P01_TestNG_Intro {

    @Test(priority = 2)
    public void testOnePlusFive(){
        System.out.println("Test One + Five is running");
        assertEquals(1+5,6);

    }

    @Test(priority = 1)
    public void testTenMinusFour() {

        System.out.println("Test Ten - Four is running");
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

