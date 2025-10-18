package day03;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class P02_switchCase {
    /*
        Bir bankamatik menüsü ve seçime göre işlem yapan bir JAVA Programı Yazınız

        ========= WISE BANK ATM =========
        ============== MENU =============
            1- Hesap Bakiyesi Göster
            2- Para Çek
            3- Para Yatır
            4- Çıkış

 */
    public static void main(String[] args) {
        System.out.println("========= WISE BANK ATM =========");
        System.out.println("============== MENU =============");
        System.out.println("Yapmak istediğiniz işlemi seçiniz!");
        Scanner scan=new Scanner(System.in);
        System.out.println("\t1- Hesap Bakiyesi Göster\n\t2- Para Çekme\n\t3- Para Yatırma\n\t4- Çıkış");
        System.out.println();
        System.out.print("Seçiminiz: ");
        int secim=scan.nextInt();
        int bakiye=103258;

        switch (secim){
            case 1:System.out.println("Bankamız nezdindeki hesap bakiyeniz "+bakiye+"₺ dir"); break;
            case 2:
                if (bakiye==0){
                    System.out.println("Hesabınızda para bulunmamaktadır\n\tHesap Bakiyesi: "+bakiye);
                }else{
                    System.out.print("Çekmek istediğiniz tutar: ");
                    int cekilenTutar=scan.nextInt();
                    if (cekilenTutar<=bakiye){
                        System.out.println("İşleminiz yapılıyor. Paranızı almadan ayrılmayınız");
                        System.out.println("Para çekimi sonrası kalan bakiyeniz: "+(bakiye-cekilenTutar));
                    }else{
                        System.out.println("Bu tutarda çekim yapamazsınız. \n\tÇekebilceğiniz tutar:"+bakiye);
                    }
                }break;
            case 3:
                System.out.print("Yatıracağınız tutarı giriniz: ");
                int yatanTutar=scan.nextInt();
                bakiye+=yatanTutar;
                System.out.println("Para yatırma İşlemi Sonucu hesap bakiyeniz:"+bakiye);
                break;
            case 4:
                System.out.println("Çıkış yapılıyor...");
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış tuşa bastınız. İşleminiz sonlandırılıyor...");
        }

    }
}
