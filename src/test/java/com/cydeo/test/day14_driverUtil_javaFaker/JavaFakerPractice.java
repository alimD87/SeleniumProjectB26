package com.cydeo.test.day14_driverUtil_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void java_faker_test(){

        // whenever you need fake random test data for you testing you can use Faker class
        Faker faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.numerify(\"773-###-####\") = " + faker.numerify("773-###-####"));
        System.out.println("faker.letterify(\"??????????\") = " + faker.letterify("??????????"));
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard().replaceAll(\"-\",\"\") = " + faker.finance().creditCard().replaceAll("-", ""));
        System.out.println("faker.bothify(\"##??##-###??-????##\") = " + faker.bothify("##??##-###??-????##"));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\",\"Saim\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Nadir"));

    }
}
