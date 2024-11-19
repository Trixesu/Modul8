package com.mycompany.modulviii;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak data\t: ");
        int n = input.nextInt();
        
        double jumlahKuadrat = 0;
        double jumlahAkar = 0;
        double jumlah1PerData = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan Nilai ke-"+i+"\t: ");
            double xi = input.nextInt();
            
            jumlahKuadrat += Math.pow(xi, 2);
            jumlahAkar += Math.sqrt(xi);
            if (xi != 0) {
                jumlah1PerData += 1 / xi; 
            }
        }
        System.out.println("===========================");
        System.out.println("Hasil Perhitungan");
        System.out.println("Jumlah Kuadrat\t: "+jumlahKuadrat);
        System.out.println("Jumlah Akar\t: "+jumlahAkar);
        System.out.println("Jumlah 1/data (data tidak sama dengan nol) : "+jumlah1PerData);
        input.close();
    }
}
