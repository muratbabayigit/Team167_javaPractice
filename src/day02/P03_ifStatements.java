package day02;

import java.util.Scanner;

public class P03_ifStatements {
    public static void main(String[] args) {
/*
        Kullanıcıdan bir sayı alıp sayıyı kontrol edip
        çift sayı ise Girdiğiniz sayı çift sayıdır
        tek sayı ise Girdiğiniz sayı tek sayıdır
        sıfır ise Sıfır girdiniz
        şeklinde yazdırsın
 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Sayı giriniz: ");
        int number= scan.nextInt();
        if (number==0){
            System.out.println("Sıfır Girdiniz");
            System.exit(0); //Kodu Durdurur. Bu satırdan sonrasına bakmaz
        }


        if (number%2==0){
            System.out.println("Girdiğiniz sayı çift sayıdır");
        }

        if (number%2!=0){
            System.out.println("Girdiğiniz sayı tek sayıdır");
        }

    }
}
