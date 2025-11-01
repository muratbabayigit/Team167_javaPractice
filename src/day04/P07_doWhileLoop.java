package day04;

import java.util.Scanner;

public class P07_doWhileLoop {
    public static void main(String[] args) {
        // Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        // hesaplayan fonksiyonu yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        long sayi= scan.nextLong();
        long girilenSayi=sayi;
        long faktoriyel=1;
        do {
            faktoriyel*=sayi;
            sayi--;
         }   while(sayi>0);
        System.out.println(girilenSayi+"! = "+faktoriyel);

    }
}
