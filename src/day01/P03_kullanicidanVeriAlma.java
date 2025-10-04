package day01;

import java.util.Scanner;

public class P03_kullanicidanVeriAlma {
    /*
        Kullanıcıdan Adını, Soyadını, Mail adresini ve Telefon numarasını alıp
            Adınız :
            Soyadınız :
            Yaş:
            E-Posta :
        şeklinde bir tablo halinde yazdırınız
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sizden istenilen bilgileri giriniz!");
        System.out.print("Adınız: ");
        String name=scan.nextLine();
        System.out.print("Soyadınız: ");
        String surname= scan.nextLine();
        System.out.print("Yaşınız: ");
        int age=scan.nextInt();
        System.out.print("E-Posta Adresiniz: ");
        String email=scan.next();
        //System.out.println("Adınız: "+name);
        System.out.println("Adınız: "+name+"\nSoyadınız: "+surname+"\nYaşınız: "+age+"\nE-Posta:"+email);
        //nextLine atlama problemi: https://babayigit.net/scan-nextline-atlama-problemi/
    }
}
