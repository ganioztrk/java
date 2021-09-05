
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Lütfen yaş girini:");
        // burada kullanıcıdan int değer almak istedigimizi söylüyoruz.
        
        //bunun yerine double yada char degerler de isteyebiliriz.
        
        //ama double kullanırsak bu kez scanner.nextdouble gibi bir kod 
        //kullanyoruz ya da yazı girecekse nextline olusturuyoruz
        
        //int yas = scanner.nextInt();
        
       // System.out.println("Yaşınız " + yas);
       
        System.out.print("Lütfen Yaş Giriniz: "); 
       
        if (scanner.hasNextInt()){
        int yas = scanner.nextInt();
        System.out.println("Yaşınız: " + yas);
        }
        else{ 
            System.out.println("Lütfen Sayı giriniz...");
        
        }
        
    }
  
}
