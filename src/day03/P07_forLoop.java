package day03;

import java.util.Scanner;

public class P07_forLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 adet tam sayı giriniz!");
        int toplam = 0;
        int s = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+".sayıyı giriniz:");
            s = scan.nextInt();
            if (s>=5 && s<=10){
                continue;
            }
            toplam+=s;

        }

        System.out.println("Girdiğiniz Sayıların Toplamı: "+toplam);

    }
}
