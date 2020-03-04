package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CodeCraft20Div2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //no of test cases
        int t = scanner.nextInt();
        int n = 0,m =0;
        List<Integer> list = new ArrayList<>();
        for (int i =0;i<t;i++) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            for (int j =0;j<n;j++) {
                list.add(scanner.nextInt());
            }
            Collections.sort(list);
            int l = list.get(list.size()-1);
            int f = 0;
            for (int k=0;k< n-1;k++) {
                f = list.get(k);
                for (int y=0;y<f;y++) {
                    if (l < m) {
                        l = l + 1;
                    }
                }
            }
            System.out.println(l);
            list.clear();
        }



    }
}
