package day03;

public class P08_forLoop {
    public static void main(String[] args) {
        //        1 2 3 4 5 6
        //         2 3 4 5 6
        //          3 4 5 6
        //           4 5 6
        //            5 6
        //             6
//   şeklini konsola yazdiriniz.

        //satır sayısını beliledik

        for (int i = 1; i <= 6; i++) {
            //boşlukları belirleyelim
            for (int bosluk = 1; bosluk < i; bosluk++) {
                System.out.print(" ");
            }
            //sayıları yazdırıyoruz
            for (int j = i; j <= 6; j++) {
                System.out.print(j+"  ");
            }
            System.out.println();


        }
    }
}
