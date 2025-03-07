public class tekcift {
    private static Object var;

    public static void main(String[] args) {
        int sayi = 16;
        int min = 1;
        int max = 55;
        while (true) {
            if (sayi % 2 == 1) {
                System.out.println("ONUR");
                break;
            } else if (sayi % 2 == 0 && sayi % 3 == 0) {
                System.out.println("NURAN");
                break;
            } else if (sayi % 2 == 0 && sayi % 3 == 1) {
                System.out.println("İNCİ");
                break;
            } else
                System.out.println("1 ile 55 arasında bir sayı giriniz.");
            break;
        }
    }
}

