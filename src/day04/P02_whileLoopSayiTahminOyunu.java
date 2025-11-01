package day04;

import java.util.Random;
import java.util.Scanner;

public class P02_whileLoopSayiTahminOyunu {
    public static void main(String[] args) {
/*
        Sayı Tahmin Oyunu:
            1- Sistem random bir sayı belirler
            2- Kullanıcıdan ilgili aralıkta bir sayı tahmin etmesini söyler
            3- Kullanıcı tahmin eder,
                eğer doğru ise: Tebrikler n. tahmininizde bildiniz     desin
                eğer yanlış ise: Bilmediniz. Tekrar tahmin edin
                                 3 tahmin hakkınız kaldı     desin
            4- Kullanıcı belirlenen limitlerde bilemezse:Üzgünüm 5 tahmin hakkınızı da kullandınız.
                                                         Doğru bilemediğiniz için oyun bitiriliyor   desin
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Aklımdan 1-100 arasında olmak üzere bir sayı tuttum. Hadi bil!");
        Random rnd = new Random();
        int sayi = rnd.nextInt(1, 100);   //random class'ı girilen aralıkta olmak üzere rastgele bir sayı üretip variable'a atar.
        int tahminHakki = 5;
        int ilkTahminHakki = 5;
        int tahminSayisi = 1;
        int tahmin = 0;

        while (ilkTahminHakki > 0) {//Parantez içerisine döngünün devam etme şartı yazılır. Şart sağlandıkça döngü devam eder
            System.out.print("Tahmininiz: ");
            tahmin = scan.nextInt();
            if (tahmin > sayi) {
                System.out.println("Yüksek söyledin. Daha düşük bir tahminde bulun");
            } else if (tahmin < sayi) {
                System.out.println("Az söyledin. Daha yüksek bir tahminde bulun");
            } else {
                System.out.println("Tebrikler " + tahminSayisi + ". tahminizde doğru bildiniz");
                System.exit(0);
            }
            tahminSayisi++;
            tahminHakki--;
            if (tahminHakki == 0) {
                System.exit(0);
            } else if (tahminHakki>0) {
                System.out.println(tahminHakki + " adet tahmin hakkınız kaldı");
            } else {
                System.out.println("Üzgünüm"+ilkTahminHakki+" tahminizde de bilemediniz. Oyun Bitiriliyor");
            }

        }


    }
}
