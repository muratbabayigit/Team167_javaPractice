package day02;

public class P02_opreators {
    public static void main(String[] args) {

 /*
            + : Matematiksel işlemlerde toplama işlemi yapar. [ sting bir yazı ile veri içeren bir variable yazdırılırken birleştirilir ]
            - : Çıkarma işlemi yapar
            / : Bölme işlemi yapar
            * : Çarpma İşlemi yapar
            % : Modulus (bir sayının başka bir sayıya bölümünden kalanı ifade eder
            = : atama operatörü olur
            == : bu iki eşitliğin sağ tarfındakilerin sol tarafındakilere eşit olduğunu gösterir.
          && : bu mantıksal and operatörü sağındaki koşul ve solun koşulun aynı anda geçerli olmasını bekleri
          ||  :  or (veya) operatörü sağındaki veye solundaki koşullardan birinin doğrulanması durumunda kullanılr
          !=  : eşit değildir operatörüdüt ve sağındaki ile solundaki durumun eşit olmaması durumunda geçerli olur.

  */

        int a = 100;
        System.out.println("Verilen Değer: " + a);


        // % modulus operatorü

        System.out.println("25 sayısının 2 sayısına bölümünden kalan: " + (25 % 2));

        // Çift sayıların tespitinde kullanılır sayı%2 = = 0 olursa bu sayı bir çift sayıdır.

        System.out.println(5 == 5); //true
        System.out.println(5 != 8); //true


    }
}
