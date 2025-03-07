import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        int kullanicininTahmini = -1;
        int rastgeleSayi;
        boolean islemeDevamEdebilir = false;
        Scanner sc = new Scanner(System.in);
        Random randomNesnesi = new Random();
        rastgeleSayi = randomNesnesi.nextInt(6);
        System.out.println("Lütfen tahmin ettiğiniz rakamı giriniz veya oyundan çıkmak için -1 giriniz: " );
        if (sc.hasNextInt())
        {
            kullanicininTahmini = sc.nextInt();
            islemeDevamEdebilir = true;
        }
        else
        {
            System.out.println("girdiğiniz veri hatalı, oyunu oynamak isterseniz rakam giriniz 1 ile 5 arası :D ");
            islemeDevamEdebilir = false;
        }
        if (kullanicininTahmini ==-1)
        {
            System.out.println("oyundan çıkmak istediniz güle güle");
            islemeDevamEdebilir = false;
        }
        if (islemeDevamEdebilir) {
            if (kullanicininTahmini == rastgeleSayi) {
                System.out.println("rastgele olusturulan sayi: " + rastgeleSayi);
                System.out.println("Kazandin");
            } else {
                System.out.println("rastgele olusturulan sayi: " + rastgeleSayi);
                System.out.println("Kaybettin");
            }
        }
    }
}
