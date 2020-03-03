package com.company;

import java.util.Scanner;

public class watermelon {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        System.out.println(w!=2 && w%2==0 ? "YES" : "NO");
    }
}
