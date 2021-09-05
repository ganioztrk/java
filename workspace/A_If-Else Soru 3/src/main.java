
import java.util.Scanner;

/*zorluk: * * *
if-else soru3:
STEP1: Kullanıcıdan bir yıl isteyin. Girilen yılın milattan sonra olup olmadığını (yani pozitif bir tamsayı olup olmadığını kontrol edin). 
Değilse uyarı verin.

STEP2: Girilen yılın artık yıl (yılın 366 gün) olup olmadığını kontrol edin. 
Bir yılın 366 gün olması için şart şu. Yılın 4 ile tam bölünmesi. AMA yıl 100'ün katı ise (örn 1700, 3000, 2100, 2000) 
bu yılın artık yıl olması için 400 ile tam bölünebilmesi lazım. 
     örn:
input: 2008  ----------->  Artık mı: EVET      (4 ile tam bölünüyor)
input: 2100   ----------->  Artık mı: HAYIR   (100'ün katı ama 400 ile bölünmüyor)
input: 1999   ----------->  Artık mı: HAYIR   (4 ile tam bölünmüyor)
input: 1600  ----------->  Artık mı: EVET      (100'ün katı ve 400 ile tam bölünüyor)
*/


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int yıl;
        
        
                
        System.out.print("Lutfen bir yıl giriniz: ");
        yıl = scanner.nextInt();
        
        if (yıl <= 0) {
            System.out.println("HATALI GİRİŞ YAPTINIZ");
        }
        else {
            /*if (yıl % 400 == 0) {
                System.out.println("ARTIK YIL");
            }
            else if (yıl % 100 == 0) {
                System.out.println("ARTIK YIL DEĞİL");
            }
            
            else if (yıl % 4 == 0) {
                System.out.println("ARTIK YIL");
            }
            
            else {
                System.out.println("ARTIK YIL DEĞİL");
            
            }
      */
            
            if( (yıl%400==0) || (yıl%4==0 && yıl%100!=0)){
                System.out.println("ARTIK YIL");
            }
            
            
            else{
                System.out.println("ARTIK DEĞİL");
            }
    } 
    }
}
