package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringModificationCodeCrafts {
    public static void main(String[] args) {
        String s = "alaska";
        String[] str = s.split("");
        System.out.println(Arrays.toString(str));
        String l;

        //Reverse sub-string
        List<String> list = new ArrayList<>();
        for (int i = 0; i<str.length-1; i++) {
            l = str[i];
            str[i] = str[i+1];
            str[i+1] = l;
            list.add(Arrays.toString(str));
        }
        System.out.println(Arrays.toString(str));
        list.forEach(System.out::println);
        System.out.println("hk");
        System.out.println(list);
        System.out.println(list.stream().collect(Collectors.joining("","","")));


        //String Array to String
        List<String> second = Arrays.asList("R","A","M");
        String joined = second.stream().collect(Collectors.joining("","",""));
        System.out.println(joined);

    }
}
