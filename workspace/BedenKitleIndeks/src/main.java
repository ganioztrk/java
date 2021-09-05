
import java.util.Scanner;




public class main {
    public static void main(String[] args) {
        // boy ve kilo bilgilerini alacağız sonrasında indeks hesaplamaca
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuzu giriniz: ");
        
        int kilo = scanner.nextInt();
        
        System.out.println("Boyunuzu Giriniz: ");
        
        double boy = scanner.nextDouble();
        
        double BKI = kilo / (boy * boy);
        
        System.out.println("Beden kitle indeksiniz: " + BKI);      
        
        
        
        
        
        
    }
    
    
}
