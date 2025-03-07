import java.io.File;
public class exception {
    public static void main(String[] args) {
        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullException");
        }

        try {
            int [] sayi = new int[3];
            sayi[5] = 1;
            System.out.println(sayi[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayException");
        }

        try {
            int a = 3, b = 0;
            int c = a/b;
            System.out.println("Sonuç: " +c);
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        try{
            Number[] a = new Double[2];
            a[0] = new Integer(4);
            System.out.println(a[0]);
        }catch (Exception e) {
            System.out.println("Array Store Exception");
        }
        }
    }


