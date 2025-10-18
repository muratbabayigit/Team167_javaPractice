package day03;

import java.util.Scanner;

public class P01_switchCase {
    public static void main(String[] args) {
        //Soru: Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
        Scanner scan=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz: ");
        int sayi= scan.nextInt();
        int birlerBasamagi=(sayi%10);
        int onlarBasamagi=(sayi/10)%10;
        int yuzlerBasamagi=sayi/100;
        String metinSayi="";

        if (sayi<100 || sayi>999){
            System.out.println("3 basmaklı bir sayı girmediniz\nTekrar çalıştırıp 3 basamaklı bir sayı giriniz!");
        }else{
            switch (yuzlerBasamagi){
                case 1: metinSayi+="Yüz";break;
                case 2: metinSayi+="İkiyüz";break;
                case 3: metinSayi+="Üçyüz";break;
                case 4: metinSayi+="Dörtyüz";break;
                case 5: metinSayi+="Beşyüz";break;
                case 6: metinSayi+="Altıyüz";break;
                case 7: metinSayi+="Yediyüz";break;
                case 8: metinSayi+="Sekizyüz";break;
                case 9: metinSayi+="Dokuzyüz";break;
                default:
            }
            switch (onlarBasamagi){
                case 0: metinSayi+="";break;
                case 1: metinSayi+="on";break;
                case 2: metinSayi+="yirmi";break;
                case 3: metinSayi+="otuz";break;
                case 4: metinSayi+="kırk";break;
                case 5: metinSayi+="elli";break;
                case 6: metinSayi+="altmış";break;
                case 7: metinSayi+="yetmiş";break;
                case 8: metinSayi+="seksen";break;
                case 9: metinSayi+="doksan";break;
                default:
            }
            switch (birlerBasamagi){
                case 0: metinSayi+="";break;
                case 1: metinSayi+="bir";break;
                case 2: metinSayi+="iki";break;
                case 3: metinSayi+="üç";break;
                case 4: metinSayi+="dört";break;
                case 5: metinSayi+="beş";break;
                case 6: metinSayi+="altı";break;
                case 7: metinSayi+="yedi";break;
                case 8: metinSayi+="sekiz";break;
                case 9: metinSayi+="dokuz";break;
                default:
            }
            System.out.println("Girmiş olduğunuz "+sayi+" sayısının okunuşu: "+metinSayi);
        }


    }
}
