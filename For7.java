package com.mycompany.modulviii;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan koefisien a : ");
        int a = input.nextInt();
        System.out.print("Masukkan koefisien b : ");
        int b = input.nextInt();
        System.out.print("Masukkan koefisien c : ");
        int c = input.nextInt();
        
        if (a == 0) {
            System.out.println("Koefisien a tidak boleh nol");
            return;
        }
        double d = Math.pow(b, 2) - 4 * a * c;
        
        if (d > 0) {
            double akar1 = (-b - Math.sqrt(d)) / (2 * a);
            double akar2 = (-b + Math.sqrt(d)) / (2 * a);
            
            System.out.println("Dari persamaan y = "+a+"x^2 + "+b+"x + "+c);
            System.out.println("Akar-akarnya adalah "+akar1+" dan "+akar2);
            System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah");
            System.out.println("-------------------------------------------------------------");
            System.out.println("x\t\ty = "+a+"x^2 + "+b+"x + "+c);
            System.out.println("-------------------------------------------------------------");
            
            for (double x = akar1; x <= akar2; x += 0.25) {
                double y = a * Math.pow(x, 2) + b * x + c;
                System.out.println(x+ "\t\t"+y);
            }
            System.out.println("-------------------------------------------------------------");
        } else {
            System.out.println("Persamaan tidak memiliki dua akar real");
        }
        input.close();
    }
}
