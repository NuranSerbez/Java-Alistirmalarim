import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {
        int KullanicininDegeri;
        Scanner sayi = new Scanner(System.in);
        System.out.println("Ters üçgenin yüksekliği kaç olsun:");
        sayi = new Scanner(System.in);
        KullanicininDegeri = sayi.nextInt();
        for (int i =0 ; i < KullanicininDegeri ; i++) {
            for (int j =0 ; j <i; j++) {
                System.out.print(" ");
            }
            for (int k=KullanicininDegeri; k>(2*i); k--){
                System.out.print("*");
            }System.out.println();
        }
    }
}
