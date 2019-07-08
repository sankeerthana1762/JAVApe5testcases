package com.stackrote.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ImplementationOfMapTest {
    ImplementationOfMap obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new ImplementationOfMap();
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


    public void givenAMapInputShouldSwapTheValues() {
        Map<String,String> map=new HashMap<String,String>();
        map.put("val1","java");
        map.put("val2","c++");
        String expected = "{val2=java, val1= }";
        String actual = obj.stringChange(map);
        assertEquals(expected,actual);

    }
    @Test

    //Act


    public void givenAMapInputShouldSwapTheValuesMarsAndSaturn() {
        Map<String,String> map=new HashMap<String,String>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String expected = "{val2=mars, val1= }";
        String actual = obj.stringChange(map);
        assertEquals(expected,actual);

    }



}