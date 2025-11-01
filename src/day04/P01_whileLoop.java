package day04;

import java.util.Scanner;

public class P01_whileLoop {

    // Kullanıcıdan bir kelime girmesini isteyip kelimenin içindeki
    // indexi çift sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime girin: ");
        String kelime = scan.next();
        int index = 0;

        while (index < kelime.length()) {

            if (index%2==0){
                System.out.println(index+".index : "+kelime.charAt(index));
            }
            index++;
        }


    }
}
