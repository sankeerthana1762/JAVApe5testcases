package com.stackrote.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStringtoMapTest {
    ArrayStringtoMap obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new ArrayStringtoMap();
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


    public void givenArrayListReturnsMapWithStringAndTrue() {
        String expected = "{a=true, b=false, c=true, d=false}";
        String actual=obj.checkCount("a,b,c,d,a,c,c");

        assertEquals(expected,actual);

    }
    @Test

    //Act


    public void givenArrayListReturnsFalseWhenGivenEmptyString() {
        String expected = "{=false}";
        String actual=obj.checkCount("");

        assertEquals(expected,actual);

    }
    @Test
    public void givenArrayListReturnsNull() {

        String actual=obj.checkCount(null);
        assertNull(actual);
    }


}