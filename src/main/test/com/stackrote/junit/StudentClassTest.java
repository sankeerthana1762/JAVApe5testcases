package com.stackrote.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentClassTest {
    StudentClass obj;

    @Before
    public void setUp() {
        System.out.println("Before");

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

    public void givenArrayListReturnsFalseWhenGivenEmptyString() {

        List<StudentClass> al = new ArrayList<>();

        // create customer objects using constructor initialization
        StudentClass obj1 = new StudentClass(10,"harika",22);
        StudentClass obj2 = new StudentClass(22,"sneha",23);
        StudentClass obj3 = new StudentClass(13,"ashritha",26);
        StudentClass obj4 = new StudentClass(18,"bhanu",12);
        StudentClass obj5 = new StudentClass(24,"sahithi",19);

        // add customer objects to ArrayList
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        Collections.sort(al,new StudentSorter());
        String expected="[StudentClass{id=18, name='bhanu', age=12}, StudentClass{id=24, name='sahithi', age=19}, StudentClass{id=10, name='harika', age=22}, StudentClass{id=22, name='sneha', age=23}, StudentClass{id=13, name='ashritha', age=26}]";
        assertEquals(expected, al.toString().trim());



    }

}