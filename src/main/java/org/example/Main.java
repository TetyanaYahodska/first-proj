package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String >list = new ArrayList<>();
        list.add("aaa"); list.add("asss");  list.add("asddd");   list.add("asdff");
        System.out.println(list+ " list");
        System.out.println(StringListHandler.listHandler(list) + " set");
    }
}