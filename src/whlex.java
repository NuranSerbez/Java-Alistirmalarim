import java.util.Random;
import java.util.Scanner;
public class whlex {
    public static void main(String[] args){
        int randomValue,checkValue,count = 1;
        boolean checkWhile = true;
        Scanner scanner = new Scanner(System.in);
        Random random2 = new Random();
        randomValue = random2.nextInt(10);
        System.out.println(" İlk tahmininiz: ");
        checkValue = scanner.nextInt();
        while(checkWhile == true){
            if (checkValue == randomValue){
                System.out.println("Tebrikler doğru tahmin. "+count+" deneme sonucunda doğru değere ulaştınız.");
                checkWhile = false;
            } else if (checkValue != randomValue){
                count++;
                System.out.println("Yeni bir tahmin yapın: ");
                checkValue = scanner.nextInt();
            }else {
                System.out.println("SADECE SAYI GİRİNİZ");
            }
        }
    }
}
