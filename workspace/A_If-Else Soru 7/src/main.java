
import java.util.Scanner;

/*zorluk: * * *
if-else soru7:
STEP1: Kullanıcıdan haftanın hangi gününde olduğunuzu girmesini isteyin. (pzt için 1, pazar için 7 olacak şekilde 1-7 arasında bir sayı). 
Girilen sayının geçerli olup olmadığını kontrol edip, değilse hatalı giriş uyarısı verin.

STEP2: Kullanıcıdan kaç gün sonrasını öğrenmek istediğini bir tamsayı olarak isteyin. (örn: 13 gün sonra günlerden ne olduğu) 
Ve 13 gün sonra haftanın kaçıncı günü olduğunu ve günün haftasonu olup olmadığını ekrana yazdırınız.

STEP3: Günün ismini ekrana yazı ile 'pazartesi', 'perşembe' vs. şeklinde yazdırınız.
     örn: 
input: bugün/gün sayısı   --------> hangi gün / içi-sonu          -----> STEP3: gün ismi
input: 5 / 6                     ----------->  Gün:4/ hafta içi       -----------> perşembe
input: 1 / 11                     ----------->  Gün:5/ hafta içi       -----------> cuma
input: 5 / 1999              ----------->  Gün:2/ hafta içi       -----------> salı
input: 3 / 25                   ----------->  Gün:7/ hafta sonu  -----------> pazar
input: 7 / 55                   ----------->  Gün:6/ hafta sonu  -----------> cumartesi
*/
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int today, forward, forwarddate;
        
        System.out.println("LUTFEN BULUNDUĞUNUZ GÜNÜ GİRİN (1-7)\nPZT :1 - PZR : 7");
        System.out.print("GÜN BİLGİSİ: ");
        today = scanner.nextInt();
        
        if(today < 1 || today > 7){
            System.out.println("Hatalı Giriş Yaptınız");
        }
        else{
            System.out.print("Kaç Gün İleri Gideceğinizi Yazın: ");
            forward = scanner.nextInt();
            forwarddate = (today + forward) % 7;
        
            if(forwarddate % 7 == 0){
                
                forwarddate = 7;
            }
            System.out.println("GÜN: " + forwarddate);
            if(forwarddate == 6 || forwarddate == 7){
                System.out.println("HAFTASONU");
            }
            else{
                System.out.println("HAFTAİÇİ");
            }
            
            if(forwarddate == 1){
                System.out.println("PAZARTESİ");
            }
            else if(forwarddate == 2){
                System.out.println("SALI");
            }
            else if(forwarddate == 3){
                System.out.println("ÇARŞAMBA");
            }
            else if(forwarddate == 4){
                System.out.println("PERŞEMBE");
            }
            else if(forwarddate == 5){
                System.out.println("CUMA");
            }
            else if(forwarddate == 6){
                System.out.println("CUMARTESİ");
            }
            else if(forwarddate == 7){
                System.out.println("PAZAR");
            }
        }    
    }
}

