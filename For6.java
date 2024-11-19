package com.mycompany.modulviii;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Deret Fibonacci : ");
            int n = input.nextInt();
            
            int a = 1, b = 1;
            System.out.print("Deret Fibonacci : ");
            
            if (n >= 1) {
                System.out.print(a);
            } if (n >= 2) {
                System.out.print(", "+b);
            }
            
            for (int i = 3; i <= n; i++) {
                int jumlah = a +b;
                System.out.print(", "+jumlah);
                a = b;
                b = jumlah;
            }
        System.out.println();
        input.close();
    }
}
