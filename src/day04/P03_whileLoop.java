package day04;

import java.util.Scanner;

public class P03_whileLoop {
      /*
        kullanıcdan alınan bir sayinin basamak degerlerinin toplamini
        while loop ile yazdıran bir method create ediniz.
   */
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("Bir sayı giriniz: ");
          long sayi = scan.nextLong();

          basamaklariTopla(sayi);
      }

    public static void basamaklariTopla(long sayi) {
        long toplam = 0;
        long girilensayi = sayi;
        while (sayi != 0) {
                toplam += sayi % 10;
                sayi /= 10;
        }
        System.out.println(girilensayi + " sayısının basamak değerleri topalmı: " + toplam);
    }
}
