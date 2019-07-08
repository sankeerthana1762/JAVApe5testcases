package com.stackrote.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetInterfaceSortingTest {

    SetInterfaceSorting obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new SetInterfaceSorting();
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


    public void givenInputHashSetShouldReturnSortedOrder() {
        String expected = "[Alice, Harry, Olive]";
        String actual=obj.addelements("Harry Olive Alice".split(" ")).toString();

        assertEquals(expected,actual);

    }
    @Test

    //Act


    public void givenInputHashSetShouldReturnNothing() {
        String expected = "[]";
        String actual=obj.addelements("".split(" ")).toString();

        assertEquals(expected,actual);

    }
}