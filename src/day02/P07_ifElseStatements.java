package day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P07_ifElseStatements {
    /* Problem tanimi : Kulanicidan aracinin hizini aliniz Trafik cezasinin
      degerini hesaplayin. 55 hiz siniridir.
     * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
     * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
     * Eger Hiziniz 85 - 94 arainda ise: Ceza 320 $'dir.
     * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
     * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
     *
     * örn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Belirlenen Hız Değeri: ");
        double hiz = scan.nextDouble();
        int ceza;

        if (hiz < 55) {
            ceza = 0;
             } else if (hiz >= 55 && hiz <= 74) {
            ceza = 100;
        } else if (hiz >= 75 && hiz <= 84) {
            ceza = 150;
        } else if (hiz >= 85 && hiz <= 94) {
            ceza = 320;
        } else {
            ceza = 500;
        }

        System.out.print("Ehliyetiniz Var mı? (E/H) : ");
        char ehl = scan.next().toUpperCase().charAt(0);

        if (ehl == 'H') {
            ceza += 200;
            System.out.println("Radar Tespitlerine göre hızınız " + hiz + " olarak Tespit edildi\nAyrıca ehliyetiniz olmadığı tespit edildi.\nCeza Tutarınız: " + ceza);
        } else {
            System.out.println("Radar Tespitlerine göre hızınız "+hiz+" olarak Tespit edildi\nCeza Tutarınız: "+ceza);

        }
    }


}
