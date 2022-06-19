package com.cydeo.test.day14_driverUtil_javaFaker;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void singleton_understanding_test() {

        String str1 = Singleton.getWord();
        System.out.println("word1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("word2 = " + str2);

        String str3 = Singleton.getWord();
        System.out.println("word3 = " + str3);

    }
}
