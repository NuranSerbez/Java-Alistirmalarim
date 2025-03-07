import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin.");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.print("Girdiğiniz sayı pozitiftir");
        }else if(number < 0){
            System.out.print("Girdiğiniz sayı negatiftir");
        }else{
            System.out.print("Girdiğiniz sayı sıfırdır");
        }
        scanner.close();
    }
}