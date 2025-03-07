import java.util.Random;
import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        int randomValue, checkValue, count = 1;
        boolean checkWhile = true;
        Scanner sc = new Scanner(System.in);
        Random random1 = new Random();
        randomValue = random1.nextInt(10);
        System.out.println(" İlk tahmininiz: ");
        try {
        checkValue = sc.nextInt();
//if(checkValaue !=null)
            if (checkValue == randomValue) {
                System.out.println("Tebrikler doğru tahmin. " + count + " deneme sonucunda doğru değere ulaştınız.");
                checkWhile = false;
            } else {
                count++;
                System.out.println("Yeni bir tahmin yapın: ");
                checkValue = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("sadece sayı giriniz");
            e.printStackTrace();

        }
    }
}



