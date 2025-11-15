package day05;

import java.util.Arrays;

public class P04_multiDimensional {
    public static void main(String[] args) {
        // multidimensional arrayin iç array lerindeki tüm elemanların toplamını
        // birer birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
        // yazdıran programı yaziniz.
        // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

        int [][] mdArr={{10,20,30},{4},{6,7,20}};
        int [] newArr=new int[mdArr.length];


        for (int i = 0; i < mdArr.length; i++) {
            for (int j = 0; j < mdArr[i].length; j++) {
                newArr[i]+=mdArr[i][j];
            }

        }

        System.out.println(Arrays.toString(newArr));





    }
}
