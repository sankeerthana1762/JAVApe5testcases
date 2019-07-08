package com.stackrote.junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SetInterfaceSorting {
    HashSet<String> sort=new HashSet<String>();
    //add elements
    public List<String> addelements(String[] inputArray)
    {
        for(String input:inputArray)
        {
            sort.add(input);

        }
        List<String> list=new ArrayList<String>(sort);
        Collections.sort(list);

        return list;

    }
}
