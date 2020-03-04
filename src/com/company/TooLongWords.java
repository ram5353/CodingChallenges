package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i =0;i<a;i++) {
            String s = scanner.next();
            if (s.length() > 10) {
                String[] letters = s.split("");
                List<String> l = Arrays.asList(letters);
                System.out.println(l.get(0) + (l.size() - 2) + l.get(l.size()-1));
            } else {
                System.out.println(s);
            }

        }
    }
}
