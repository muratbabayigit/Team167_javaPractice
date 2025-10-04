package day02;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class P08_nestedIfElse {
    /*
    Bir e-ticaret sitesinde sipariş veren müşterinin
    kargo ücretini hesaplayan bir Java programı yazınız.
        Eğer sipariş tutarı 500 TL veya daha fazla ise kargo ücretsizdir.
        Eğer sipariş tutarı 500 TL’nin altında ise:
        VIP müşteri olup olmadığı kontrol edilir.
        VIP müşteri ise kargo ücreti 10 TL.
        VIP müşteri değilse kargo ücreti 30 TL.
*/

    public static void main(String[] args) {
        String musteriAd = JOptionPane.showInputDialog("Adınız:");
        System.out.println("Müşteri Adı:" + musteriAd);

        Scanner scan = new Scanner(System.in);
        System.out.print("Alışveriş Tutarı: ");
        double tutar = scan.nextDouble();
        int kargoUcreti;

        if (tutar >= 500.0) {
            kargoUcreti = 0;
        } else {
            System.out.print("Müşteri vip müşteri mi?(E/H): ");
            char vip=scan.next().toUpperCase().charAt(0);

            if (vip=='E'){
                kargoUcreti=10;
            }else {
                kargoUcreti=30;
            }
        }
        System.out.println("------------------ WISE ONLINE MARKET ------------------");
        System.out.println("Sayın "+musteriAd+" yaptığınız alışverişe ait bilgiler aşağıdaki gibidir");
        System.out.println("Alışveriş Tutarı: "+tutar+"\nKargo Ücreti: "+kargoUcreti+"₺");
        System.out.println("Ödenecek Tutar: "+(kargoUcreti+tutar)+"₺");
        System.out.println(LocalDateTime.now());
        System.out.println("Yine Bekleriz");
    }

}
