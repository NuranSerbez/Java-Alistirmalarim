import java.util.Scanner;

public class tersten {
    public static void main(String[] args) {
        int girilenDeger;
        Scanner deger= new Scanner(System.in);
        System.out.println("Girilen deger: ");
        deger = new Scanner(System.in);
        girilenDeger = deger.nextInt();
        for (int i = 0; i < girilenDeger; i++) {
            for(int j = 0; j<i; j++) {
                System.out.print(" ");
            }for(int k=girilenDeger--; k>i; k--){
                System.out.print("*");
            }System.out.println();
        }
    }
}
