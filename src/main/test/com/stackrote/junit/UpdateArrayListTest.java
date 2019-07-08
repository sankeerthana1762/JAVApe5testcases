package com.stackrote.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateArrayListTest {
    UpdateArrayList obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new UpdateArrayList();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test

    //Act


    public void givenArrayListSplitsByCommaOpearator() {
        String expected = "[Kiwi, Grape, Mango, Berry]";
        String actual = obj.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        assertEquals(expected,actual);

    }


    @Test

    //Act


    public void givenArrayListShouldUpdateTheList() {
        String expected = "[Strawberry, Grape, Mango, Berry]";
        String actual = obj.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        String actual1 = obj.update(0,"Strawberry").toString();
        assertEquals(expected,actual1);

    }
    @Test

    //Act


    public void givenArrayListShouldClearAllTheElementsInTheList() {
        String expected = "[]";
        String actual = obj.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        String actual1 = obj.removeAll().toString();
        assertEquals(expected,actual1);

    }


}