import java.util.Scanner;
public class ucgen {
    public static void main(String[] args) {
        int KullaniciGirdisi;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin yüksekliği kaç olsun: ");
        KullaniciGirdisi = input.nextInt();
        for (int i = 0; i<= KullaniciGirdisi ; i++){
            for( int j = 0; j<KullaniciGirdisi - i ; j++ ){
                System.out.print(" ");
            }
            for(int k =1; k<=(2*i-1); k++){
            System.out.print("*");
        }System.out.println( );
    }
}
}