package com.mycompany.modulviii;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak resistor yang akan diolah : ");
        int banyakN = input.nextInt();
        System.out.println("Pilih Susunan Resistor");
        System.out.println("1. Seri");
        System.out.println("2. Paralel");
        System.out.print("Pilih 1 / 2 : ");
        int susunan = input.nextInt();
        System.out.println("================================");
        
        double resistor, totalN = 0.0;
        
        if (susunan == 1) {
            for (int i = 1; i <= banyakN; i++) {
                System.out.print("Masukkan nilai resistor ke-"+i+" : ");
                resistor = input.nextDouble();
                totalN += resistor;
                }
        } else if (susunan == 2) {
            for (int i = 1; i <= banyakN; i++) {
                System.out.print("Masukkan nilai resistor ke-"+i+" : ");
                resistor = input.nextDouble();
                if (resistor == 0) {
                    System.out.println("Masukkan resistor susunan paralel adalah angka 0. Silakan masukkan kembali selain angka 0.");
                    return;
                    }
                totalN += 1 / resistor;
                }
            totalN = 1 / totalN;
        } else {
            System.out.println("Pilihan tidak valid");
        }
        System.out.println("Total tahanan : "+totalN+" ohm");
        input.close();
    }
}