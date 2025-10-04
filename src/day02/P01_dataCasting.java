package day02;

import java.util.Scanner;

public class P01_dataCasting {
    public static void main(String[] args) {
     /*
        Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu tam sayı yazdırın
     */


        // byte - short - int - long - float - double


        Scanner scan = new Scanner(System.in);
        System.out.println("Lüten sizden istenen sayıları giriniz ve ENTER tuuna basınız!");
        System.out.print("1. Ondalıklı Sayı: ");
        double sayi1 = scan.nextDouble();
        System.out.print("2. Ondalıklı Sayı: ");
        double sayi2 = scan.nextDouble();
        int sonuc = (int) (sayi1 / sayi2);
        double sonucDouble = sayi1 / sayi2;
        System.out.println("sonuc = " + sonuc);
        System.out.println("sonucDouble = " + sonucDouble);

        /*
        Kullanıcıdan iki tam sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu double sayı yazdırın
     */
        System.out.println("-----------İKİNCİ İŞLEM-----------");
        System.out.println("Lüten sizden istenen sayıları giriniz ve ENTER tuuna basınız!");
        System.out.print("1.Tam Sayı: ");
        int s1= scan.nextInt();
        System.out.print("2.Tam Sayı: ");
        int s2= scan.nextInt();
        double sonuc2=s1/s2;
        System.out.println("sonuc2 = " + sonuc2);

    }
}
