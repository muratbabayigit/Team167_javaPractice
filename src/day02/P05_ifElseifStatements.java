package day02;

import java.util.Scanner;

public class P05_ifElseifStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alıp sayıyı kontrol edip
        çift sayı ise Girdiğiniz sayı çift sayıdır
        tek sayı ise Girdiğiniz sayı tek sayıdır
        Sıfır girince de Sıfır girdiniz yazdırsın
        şeklinde yazdırsın
 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number= scan.nextInt();

        if (number==0){
            System.out.println("Sıfır girdiniz");
        } else if (number%2!=0) {
            System.out.println("Girdiğiniz sayı TEK sayıdır");
        }else{
            System.out.println("Girdiğiniz sayı ÇİFT sayıdır");
        }
    }
}
