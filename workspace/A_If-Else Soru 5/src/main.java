
import java.util.Scanner;

/*zorluk: *
if-else soru5:
STEP1: Kullanıcıdan bir tamsayı alın. Alınan sayının pozitif mi negatif mi olduğunu ekrana yazdırın.

STEP2: Alınan sayının tek mi çift mi olduğunu ekrana yadırın.*/


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a;
        
        System.out.print("LÜTFEN BİR SAYI GİRİNİZ: ");
        a = scanner.nextInt();
        
        if (a < 0) {
            System.out.println("NEGATİF");
        }
        else if (a > 0) {
            System.out.println("POZİTİF");
        }
        if (a % 2 == 0) {
            System.out.println("SAYI ÇİFTTİR");
        }
        else {
            System.out.println("SAYI TEKTİR");
        }
    }
}