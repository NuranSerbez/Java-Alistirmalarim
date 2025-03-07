import java.util.Scanner;
public class toplama {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int toplama =0, i=0;
    System.out.println("Sayı giriniz");
    int n = scanner.nextInt();
    while(n>=i) {
        toplama +=i;
        i++;
    }
       System.out.println("Sayıların toplamı = " +toplama);
    }
}
