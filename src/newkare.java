import java.util.Scanner;
public class newkare {
    public static void main(String[] args) {
        int genislik;
        Scanner klavye=new Scanner(System.in);
        System.out.println("Karenin yüksekliğini seçin");
        int yukseklik=klavye.nextInt();
        genislik=yukseklik;
        for (int j=1; j<=genislik; j++) {
            System.out.print("*"+" ");
        }System.out.println(" ");
        for (int i=1; i<=yukseklik-2; i++) {
            System.out.print("*"+" ");
            for (int j=1; j<=genislik-2; j++) {
                System.out.print(" "+" ");
            }System.out.println("*");
        }
        for (int j=1; j<=genislik; j++) {
            System.out.print("*"+" ");
        }
    }
}

