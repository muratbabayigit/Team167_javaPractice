package day01;
public class P01_helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // System.err.println("Hata Yazdırma Modu");
        System.out.print("Merhaba ");
        System.out.println("Serpil");
        System.out.println();
        System.out.println();
        System.out.println();
        // println olursa yazdırır yazdırmaz aşşağıya inip aşşağıdan devam eder
        // print olursa yazdırır ve sonraki işlemi aynı satırdan yazmaya başlar
 /*
        Tek bir System.out.println(); kullanarak aşağıdaki metni yazdırın
        Merhaba Team 167
            İyi Çalışmalar
  */
        // System.out.println("Merhaba Team 167" +
        //         "        İyi Çalışmalar");
/*
        \n : bir alt satıra geçer (\r)
        \t : bir TAB tuşu kadar boşluk bırakır

 */
        System.out.println("Merhaba Team 167\n\tİyi Çalışmalar");
        /*
               Tek bir System.out.println(); kullanarak aşağıdaki metni yazdırın
               Merhaba Team 167
                "İyi Çalışmalar"
         */
        System.out.println("Merhaba Team 167\n\t\"İyi Çalışmalar\"");
        int a=369;
        int b=234;
        String name="samet";
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println(name);
        System.out.println("berk");
    }
}
