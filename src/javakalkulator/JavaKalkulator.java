/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakalkulator;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class JavaKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, d, e;
        Scanner pilihan = new Scanner(System.in);
        do {
            System.out.println("-------KALKULATOR-------");
            System.out.println("Angka 1 untuk penjumlahan");
            System.out.println("Angka 2 untuk pengurangan");
            System.out.println("Angka 3 untuk perkalian");
            System.out.println("Angka 4 untuk pembagian");
            System.out.println("Angka 5 untuk modulus");
            System.out.print("Pilihan = ");
            d = pilihan.nextDouble();

            if (d == 1) {
                System.out.print("Masukan angka pertama = ");
                a = pilihan.nextDouble();
                System.out.print("Masukan angka kedua = ");
                b = pilihan.nextDouble();
                c = a + b;
                System.out.println("Hasil = " + c);
            }

            if (d == 2) {
                System.out.print("Masukan angka pertama = ");
                a = pilihan.nextDouble();
                System.out.print("Masukan angka kedua = ");
                b = pilihan.nextDouble();
                c = a - b;
                System.out.println("Hasil = " + c);
            }
            if (d == 3) {
                System.out.print("Masukan angka pertama = ");
                a = pilihan.nextDouble();
                System.out.print("Masukan angka kedua = ");
                b = pilihan.nextDouble();
                c = a * b;
                System.out.println("Hasil = " + c);
            }
            if (d == 4) {
                System.out.print("Masukan angka pertama = ");
                a = pilihan.nextDouble();
                System.out.print("Masukan angka kedua = ");
                b = pilihan.nextDouble();
                c = a / b;
                System.out.println("Hasil = " + c);
            }
            if (d == 5) {
                System.out.print("Masukan angka pertama = ");
                a = pilihan.nextDouble();
                System.out.print("Masukan angka kedua = ");
                b = pilihan.nextDouble();
                c = a % b;
                System.out.println("Hasil = " + c);
            }

            System.out.println("--------------------------------");
            System.out.println("Apakah ingin mengulang proses ?");
            System.out.println("Jika ya ketik 1 , jika tidak ketik 2 ");
            e = pilihan.nextDouble();
        } while (e == 1);
    }
}
