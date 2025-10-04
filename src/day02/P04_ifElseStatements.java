package day02;

import java.util.Scanner;

public class P04_ifElseStatements {
    public static void main(String[] args) {
/*
        Kullanıcıdan bir sayı alıp sayıyı kontrol edip
        çift sayı ise Girdiğiniz sayı çift sayıdır
        tek sayı ise Girdiğiniz sayı tek sayıdır
        şeklinde yazdırsın
 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Sıfır hariç bir sayı giriniz: ");
        int number= scan.nextInt();

        if (number%2==0){
            System.out.println("Girdiğiniz sayı ÇİFT sayıdır");
        }else{
            System.out.println("Girdiğiniz sayı TEK sayıdır");
        }

    }
}
