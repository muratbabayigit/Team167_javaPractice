package day04;

import java.util.Scanner;

public class P06_whileLoop {
    // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
    //         tamkare ise Girilen Sayı tamkare bir sayıdır
    //         değilse Girilen Sayı tamkare bir sayı değildir
    //         yazdırınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("----- Tamsayı Kontrol Ekranı -----");
        System.out.print("Kontrol edilecek sayı: ");
        int sayi=scan.nextInt();
        boolean tamKareMi=false;
        int i=1;

        while(i*i<=sayi){
                if (i*i==sayi){
                    tamKareMi=true;
                    break;
                }
                i++;
        }
        if (tamKareMi){
            System.out.println("Girdiğiniz "+sayi+" sayısı "+i+" sayısının tamkaresidir.");
        }else{
            System.out.println("Girdiğiniz sayı bir tamkare sayı değildir");
        }


    }
}
