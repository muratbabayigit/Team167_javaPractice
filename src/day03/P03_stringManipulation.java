package day03;

public class P03_stringManipulation {
    public static void main(String[] args) {

        String metin="Ne yaparsan yap AŞK ile yap";

        //indexOf
        System.out.println(metin.indexOf('i'));
        System.out.println(metin.indexOf('a'));
        System.out.println(metin.indexOf('A'));// 16
        System.out.println(metin.indexOf('K'));// 18

        //lastIndexOf
        System.out.println(metin.lastIndexOf("i"));
        System.out.println(metin.lastIndexOf("a"));

        //substring
        System.out.println(metin.substring(16)); // AŞK ile yap
        System.out.println(metin.substring(16,19)); // AŞK     (dahil olan index, dahil olmayan index)


        //replaceAll
        System.out.println(metin);
        System.out.println(metin.replaceAll("AŞK","ŞEVK"));
        System.out.println(metin.replace("a","o"));
        System.out.println(metin.substring(0,1)+metin.replaceAll("\\W","*"));
        System.out.println(metin.substring(0,16).replaceAll("\\w","*")+
                           metin.substring(16,19)+metin.substring(19).replaceAll("\\w","*"));



        //contains,equals,equalsIgnoreCase
        System.out.println(metin.contains("j"));
        System.out.println(metin.contains("e"));
        String metin2="Ne yaparsan yap aşk ile yap";
        System.out.println(metin.equals(metin2));
        String metin3="Ne yaparsan yap AŞK ile yap";
        System.out.println(metin==metin3);


    }
}
