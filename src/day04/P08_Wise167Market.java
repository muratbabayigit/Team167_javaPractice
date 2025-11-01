package day04;

import java.util.Scanner;

public class P08_Wise167Market {

    /*
====================PROJEMIZ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
1 ŞARKÜTERİ ÜRÜNLERİ
2 MANAV ÜRÜNLERİ
3 MARKET ÜRÜNLERİ
secime göre;
4-urunleri listele ve
5-fiyatlari gelsin
6-Alışveriş bitince fiş yazdırsın.
7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/
    static Scanner scan = new Scanner(System.in);
    static boolean ekUrun=false;
    static int urunKodu=0;
    static int urunAdedi=0;
    static String urunAdi="";
    static int urunFiyati=0;


    public static void main(String[] args) {
        girisEkrani();
    }

    static void girisEkrani() {

        System.out.println("=========== WISE167MARKET ===========");
        System.out.println("---------- HOŞGELDİNİZ ----------");
        System.out.println("Lütfen Menüden Bir Seçim Yapınız\nAlışveriş yapacağınız reyonu seçiniz");
        System.out.println("MENÜ\n\t1-Şarküteri Reyonu\n\t2-Manav Reyonu\n\t3-Market Reyonu\n\t4-Fiş Yazdır\n\t5-Çıkış");
        System.out.print("Seçiminiz: ");
        int secim = scan.nextInt();

        if (!(secim>=1 && secim<=5)){
            System.out.println("Geçersiz bir işlem yaptınız. Tekrar Deneyiniz");
            girisEkrani();
        }else{
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisyazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }


    }

    public static void sarkuteri() {
        System.out.println("=========== WISE167MARKET ===========");
        System.out.println("---------- Şarküteri Reyonu ----------");
        System.out.println("Satın almak istediğiniz ürünleri sepetinize ürün Numarası ile ekleyiniz\nÜrünler");
        System.out.println("\t1001-Peynir(1kg)..........400₺\n\t1002-Yoğurt(5kg)..........200₺\n\t1003-Sucuk(1 Kangal).....625₺" +
                            "\n\t1004-Yumurta(koli)...........125₺+\n\t1005-Kaymak(1 Paket)........224₺");
        while(!(ekUrun)){
                urunKodu= scan.nextInt();
                if (urunKodu<1001 || urunKodu>1005){
                    System.out.print("Kaç paket aqlacaksınız: ");
                    urunAdedi= scan.nextInt();


                    switch (urunKodu){
                        case 1001:
                            urunAdi="Peynir";
                            urunFiyati=400;
                            System.out.println(urunAdedi+" paket "+urunAdi+" aldınız. Fiyatı: "+(urunAdedi*urunFiyati)+"₺");
                            break;
                        case 1002:
                            urunAdi="Peynir";
                            urunFiyati=400;
                            System.out.println(urunAdedi+" paket "+urunAdi+" aldınız. Fiyatı: "+(urunAdedi*urunFiyati)+"₺");
                            break;

                        case 1003:
                            urunAdi="Peynir";
                            urunFiyati=400;
                            System.out.println(urunAdedi+" paket "+urunAdi+" aldınız. Fiyatı: "+(urunAdedi*urunFiyati)+"₺");
                            break;
                        case 1004:
                            urunAdi="Peynir";
                            urunFiyati=400;
                            System.out.println(urunAdedi+" paket "+urunAdi+" aldınız. Fiyatı: "+(urunAdedi*urunFiyati)+"₺");
                            break;

                    }
                }

        }
    }

    public static void manav() {
    }

    public static void market() {
    }

    public static void fisyazdir() {
    }

    public static void cikis() {
        System.out.println("Çıkış Yapılıyor...");
        System.exit(0);
    }


}
