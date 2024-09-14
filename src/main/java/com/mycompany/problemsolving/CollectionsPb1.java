package com.mycompany.problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsPb1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] names={"Nipa","Kibria","Anika","Eva"};
        Collections.addAll(list,names);
        Collections.sort(list);
        System.out.println(list);

    }
}
