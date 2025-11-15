package day05;

import java.util.Arrays;

public class P03_array {
    public static void main(String[] args) {

        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
         */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String [] arr=str.split(" ");
        //System.out.println(Arrays.toString(arr));
        int toplamDollar=0;
        int toplamPound=0;



        for(String s:arr){

            if (s.contains("$")){
                toplamDollar+=(Integer.parseInt(s.replace("$","")));
            }else {
                toplamPound+=(Integer.parseInt(s.replace("£","")));
            }

        }

        System.out.println("Dolar Toplamı: "+ toplamDollar+"$");
        System.out.println("Pound Toplam: "+toplamPound+"£");


    }
}
