import java.util.Scanner;
public class kare{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int boyut;
        System.out.println("Karenin boyutlarını giriniz: ");
        boyut = in.nextInt();
        for(int i = 0;i<boyut;i++){
            for(int j = 0;j<boyut;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}