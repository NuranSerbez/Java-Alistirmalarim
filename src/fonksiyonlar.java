import java.util.Random;

public class fonksiyonlar {
        public static void main(String[] args) {
        merhaba();
        merhaba();
        merhaba();

        toplam(3, 5);

        int sayi1 =5;
        System.out.println(sayi1 + "! = " + faktoriyel(sayi1));

        int b = 1;
        for(int i=1; i<=7; i++){
                if (tek(i));{
                        b*=i;
                }
                System.out.println("Tek sayıların çarpımı "+b);
                }

        int[] sayilar = new int[10];
        for(int i=0; i<10; i++){
                Random rand = new Random();
                int sayi = rand.nextInt(10);
                sayilar[i] = sayi;
        }
        double ort = ortalama(sayilar);
        System.out.println("Random Ortalama: "+ort);

        }

        public static void merhaba(){
        System.out.println("Nuran Serbez");
        }

        public static void toplam(int sayi1, int sayi2){
                int sonuc = sayi1 + sayi2;
                System.out.println(sonuc);
        }

        public static int faktoriyel (int n){
                int sonuc = 1;
                for(int i = 2; i <= n; i++){
                        sonuc *= i;
                }
                return sonuc;
        }
        public static boolean tek (int a){
                if(a%2==1){
                        return true;
                }else {
                        return false;
                }
        }

        public static double ortalama(int [] dizi){
                double toplam = 0;
                for(int i = 0; i < dizi.length; i++){
                        toplam += dizi[i];
                }
                return toplam/10;
        }


}
