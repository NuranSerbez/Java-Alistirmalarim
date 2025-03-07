import java.io.*;
import java.util.Scanner;

public class dosyaislemleri {
    public static void main(String[] args) {
        //dosya oluşturma
        try {
            File dosya = new File("test.txt");
       if(dosya.createNewFile()){
            System.out.println("Dosya oluşturuldu");
        }else{
          System.out.println("Dosya oluşturulamadı");
        }
    } catch (IOException e){
            throw new RuntimeException(e);
    } finally {
        System.out.println(" ");
        }
        //dosyaya yazdırma
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Merhaba, dosyaya yazıyorum");
            writer.close();
            System.out.println("Dosya yazma işlemi tamamlandı.");
        } catch (IOException e) {
            System.out.println("Dosya yazarken bir hata oluştu: " + e.getMessage());
        }
        //dosyayı okuma
        try {
            Scanner scanner = new Scanner(new FileReader("test.txt"));
            while (scanner.hasNextLine()) {
                String satir = scanner.nextLine();
                System.out.println(satir);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + e.getMessage());
        }
    }
}

