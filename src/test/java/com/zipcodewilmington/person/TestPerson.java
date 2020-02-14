package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithNameHeightEyeColor() {
        // Given
        String expectedName = "Leon";
        Double expectedHeight = 5.6;
        String expectedEyecolor = "Brown";

        // When
        Person person = new Person(expectedName, expectedHeight, expectedEyecolor);

        // Then
        String  acctualName = person.getName();
        Double actualHeight = person.getHeight();
        String actualEyeColor = person.getEyeColor();

        Assert.assertEquals(expectedName, acctualName);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedEyecolor, actualEyeColor);
    }

    @Test
    public void testConstructorWithGenderSsnHobby() {
        // Given
        Character expectedGender = 'M';
        Integer expectedSSN = 0000;
        String expectedHobby = "Games";

        // When
        Person person = new Person(expectedGender, expectedSSN, expectedHobby);

        // Then
        Character actualGender = person.getGender();
        Integer actualSSN = person.getLast4ssn();
        String actualHobby = person.getHobby();

        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedSSN, actualSSN);
        Assert.assertEquals(expectedHobby, actualHobby);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Double expected = 5.5;

        // When
        person.setHeight(expected);

        // Then
        Double actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Brown";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        Character expected = 'M';

        // When
        person.setGender(expected);

        // Then
        Character actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLast4Ssn() {
        // Given
        Person person = new Person();
        Integer expected = 9999;

        // When
        person.setLast4ssn(expected);

        // Then
        Integer actual = person.getLast4ssn();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHobby() {
        // Given
        Person person = new Person();
        String expected = "Games";

        // When
        person.setHobby(expected);

        // Then
        String actual = person.getHobby();
        Assert.assertEquals(expected, actual);
    }
}
