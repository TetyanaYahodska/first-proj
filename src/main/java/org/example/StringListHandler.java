package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StringListHandler {
    public static Set<Character> listHandler (List<String> stringList){
    Set<Character> hashSet = new HashSet<>();

    for(String item : stringList){
          hashSet=(item.chars()
                    .mapToObj(e -> (char)e)
                    .collect(Collectors.toSet()));
          hashSet.addAll(hashSet);
    }
     return hashSet;
    }
}
