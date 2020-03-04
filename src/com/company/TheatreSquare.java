package com.company;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        long a = scanner.nextInt();
        //Math.ceil -> round the number -> Math.ceil(84.46) = 85
        double x = Math.ceil(n/a) * Math.ceil(m/a);
        System.out.println(x);
    }
}
