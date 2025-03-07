import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class dizi {
    public static void main(String[] args) {
        //sıralama
        int[] sayilar = {5, 2, 30, 41, 15}; //sayılar dizisine değer atandı
        Arrays.sort(sayilar); //değerler küçükten büyüğe sıralandı
        for (int i = 0; i < sayilar.length; i++) { //döngüye sokuldu ve tüm değerler sırasıla ekrana yazıldı
            System.out.print(sayilar[i] + " ");
        }
        System.out.println(" ");

        //matrix
        int[][] sayilar1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //sayılar1 dizisine çift boyutlu atama yapıldı
        System.out.println(sayilar1[2][0]); //satır ve sütun olarak bakılıyor çıktı öğle alınıyor
        System.out.println(" ");

        //kopyalama türleri
        int[] numbers = new int[5]; //numbers adında 5 elemanlı bir dizi tanımlandı
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + i; // 5 eleman dolana kadar indeks kendisiyle toplanarak eleman tanımlandı
        }
        int[] numbersCoppy = new int[numbers.length]; //yeni bir dizi tanımlandı dizinin uzunluğu numbers eleman sayısına eşitlendi
        for (int i = 0; i < numbers.length; i++) {
            numbersCoppy[i] = numbers[i]; //kopyalama işlemi yapıldı
        }
        for (int i = 0; i < numbersCoppy.length; i++) {
            System.out.print(numbersCoppy[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]); //iki for içinde iki dizi ayrı ayrı yazdırıldı
        }
        System.out.println(" ");
        System.arraycopy(numbers, 0, numbersCoppy, 0, numbers.length); //kopyalama işlemi indeks sayısından başlayıp numbers uzunluğu kadar kopyaladı
        for (int i = 0; i < numbersCoppy.length; i++) {
            System.out.print(numbersCoppy[i]);
        }
        System.out.println(" ");

        //arama
        int arama[] = {1, 2, 5, 6, 32, 95, 2, 6, 50, 45};
        Arrays.sort(arama);
        int deger = Arrays.binarySearch(arama, 45); //ikili arama yapılıyor. girilen değeri tek tek karşılaştırıyor
        if (deger < 0) {
            System.out.println("Girdiğiniz sayı bulunamadı");
        } else {
            System.out.println("Bulundu ve değerin indisi " + deger);
        }
        System.out.println(" ");

        //eleman arama, ekleme, silme
        ArrayList<String> liste = new ArrayList<>(); //arraylist oluşturduk
        liste.addAll(Arrays.asList("elma", "armut", "çilek", "karpuz")); //eleman tanımladık
        System.out.println("Listenin başlangıç durumu " + liste);
        //arama
        int index = 2; //listede arama
        System.out.println("indeks " + index + " deki eleman " + liste.get(index));
        //ekleme
        liste.add(2, "incir"); //listeye yeni eleman ekleme
        System.out.println("Ekleme yapıldı " + liste);
        //silme
        liste.remove(4); //listeden eleman silme
        System.out.println("Silme yapıldı " + liste);
        System.out.println(" ");

        //dizilerde karşılaştırma
        int[] karsilastirma1 = {1, 2, 5, 6, 9};
        int[] karsilastirma2 = {1, 2, 5, 9, 6};
        boolean areEqual = Arrays.equals(karsilastirma1, karsilastirma2); //her elemanı tek tek kontrol eder ve sıralama önemli
        System.out.println("Karşılaştırmanız " + areEqual);
        System.out.println(" ");

        //farklı türdeki verileri tek listede tutmak
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"a", "b", "c"};
        Double[] dblArray = {1.1, 2.2, 3.3};
        List<Object> mixedList = new ArrayList<>(); //object ile mixedlist oluştu
        mixedList.add(intArray);
        mixedList.add(strArray);
        mixedList.add(dblArray); //girilen diziler mixedliste eklendi
        for (Object obj : mixedList) {
            System.out.println(Arrays.toString((Object[]) obj)); //düzgün okunmasını tostring sağladı
        }

    }
}


