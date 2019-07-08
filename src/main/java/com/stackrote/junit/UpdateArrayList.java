package com.stackrote.junit;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayList {
    // public String elementsUpdate(ArrayList<String> arraylist)
    private static List<String> stringList = new ArrayList<>();

    // convert array of string to List
    public static List<String> addArray(String[] inputArray) {
        for (String input : inputArray) {
            stringList.add(input);
        }
        return stringList;
    }

    //  remove all element of list
    public List<String> removeAll() {
        stringList.clear();
        return stringList;
    }

    // replace list value with respective index
    public List<String> update(int index, String value) {
        stringList.set(index, value);
        return stringList;
    }

}
