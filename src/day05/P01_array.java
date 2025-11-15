package day05;

import java.util.Arrays;
import java.util.Scanner;

public class P01_array {
    public static void main(String[] args) {
        // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
        // kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
        // elemaninin arasinki farki gosteren java programi yazin

        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Elemanlı Bir Array Oluşturacaksınız: ");
        int sayi=scan.nextInt();

        int [] arr=new int[sayi];
        //int arr2 []=new int[sayi];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+".elemanı giriniz: ");
            int eleman=scan.nextInt();
            arr[i]=eleman;
        }
        Arrays.sort(arr);

        int arrMax=arr[arr.length-1];
        int arrMin=arr[0];
        System.out.println("Girdiğiniz Sayılardan En Büyüğü: "+arrMax);
        System.out.println("Girdiğiniz Sayılardan En Küçüğü: "+arrMin);
        System.out.print("İkisi Arasındaki Fark: ");
        System.out.println(arrMax+" - "+arrMin+" = "+(arrMax-arrMin));


    }
}
