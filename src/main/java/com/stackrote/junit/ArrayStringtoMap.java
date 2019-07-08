package com.stackrote.junit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayStringtoMap {
    public String checkCount(String input)
    {
        if(input==null)
        {
            return null;
        }
        List<String> string= Arrays.asList(input.split("[\\W_]+"));
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s:string)
        {
            if(map.containsKey(s)){
                int get = map.get(s);
                map.put(s, get + 1);
            }
            else{
                map.put(s, 1);
            }
        }
        Map<String, Boolean> booleanmap = new HashMap<String, Boolean>();

        for(String str:map.keySet())
        {

            if(map.get(str)>=2)
            {
                booleanmap.put(str,true);
            }
            else
            {
                booleanmap.put(str,false);
            }
        }

        return booleanmap.toString();
    }
}


