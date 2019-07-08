package com.stackrote.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCountUsingMapTest {
    WordCountUsingMap obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new WordCountUsingMap();
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


    public void givenStringStoresInMapAndDeterminesCount() {
        String expected = "{one=5, two=2, three=2}";
        String actual = obj.checkFrequency("one one -one_two,,three,one @three*one?two");
        assertEquals(expected, actual);
    }

    @Test
    public void givenStringReturnsNull() {

        String actual = obj.checkFrequency(null);
        assertNull(actual);
    }

}

