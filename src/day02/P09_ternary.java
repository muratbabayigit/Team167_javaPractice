package day02;

import java.util.Scanner;

public class P09_ternary {
    public static void main(String[] args) {

/*
        Kullanıcıdan bir sayı alıp sayıyı kontrol edip
        çift sayı ise Girdiğiniz sayı çift sayıdır
        tek sayı ise Girdiğiniz sayı tek sayıdır
        Sıfır girince de Sıfır girdiniz yazdırsın
        şeklinde yazdırsın

 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Sıfır hariç bir sayı giriniz: ");
        int number = scan.nextInt();

        System.out.println(number == 0 ? "Sıfır Giridiniz" : (number % 2 == 0) ? "Girdiğiniz sayı ÇİFT sayıdır." : "Girdiğiniz sayı TEK sayıdır");
    }
}
