package com.stackrote.junit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountUsingMap {
    public String checkFrequency(String input)
    {
        if(input==null)
        {
            return null;
        }
        List<String> string= Arrays.asList(input.split("[\\W_]+"));

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s:string) {

            if (map.containsKey(s)) {  // first time we've seen this string
                map.replace(s, map.get(s)+1);
            }
            else {

                map.put(s,  1);
            }
        }
        return map.toString();
    }
}
