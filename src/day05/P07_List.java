package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07_List {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        List<Integer> NotList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Not girişi için N tuşuna basınız: ");
        char devam=scan.next().charAt(0);
        while(devam=='N'){
            System.out.print("Notu Giriniz: ");
            NotList.add(scan.nextInt());
            System.out.print("Yeni bir not girmek için N tuşuna\nNot girişini bitimek için X tuşuna basınız.\nSeçiminiz:");
            devam=scan.next().charAt(0);
        }
        System.out.println(NotList);
        int toplam=0;
        for (int i = 0; i < NotList.size(); i++) {
            toplam+=NotList.get(i);
        }
        double notOrt=toplam/NotList.size();
        System.out.println("Sınıf Ortalaması: "+notOrt);
        
        List<Integer> Gecenler = new ArrayList<>();
        for (int i = 0; i < NotList.size(); i++) {
            if(NotList.get(i)>notOrt){
                Gecenler.add(NotList.get(i));
            }
            
        }
        System.out.println("Ortalama Üstü Öğrenci Sayısı: "+Gecenler.size());






    }
}
