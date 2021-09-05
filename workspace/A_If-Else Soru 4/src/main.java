/*zorluk: * * 
if-else soru4:
STEP1: Kullanıcıdan 3 adet double türünde kenar uzunluğu alın. ve bu 3 uzunluğun bir üçgen oluşturup oluşturamayacağını kontrol edin. 
kontrol etmeniz gereken şart şu: bir üçgenin herhangi bir kenarı diğer 2 kenarın uzunlukları toplamına eşit ya da daha fazla olamaz.
     örn:
input: 3/7/11                    ----------->  Üçgen mi: HAYIR      (11> 7+3)
input: 3,5/6/4                 ----------->  Üçgen mi: EVET
input: 2,5/2,5/2,5           ----------->  Üçgen mi: EVET*/


import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a,b,c;
        
        System.out.println("LÜTFEN ÜÇGENİN KENAR UZUNLUKLARINI GİRİN");        
        System.out.print("Kenar a: ");
        a = scanner.nextDouble();
        System.out.print("Kenar b: ");
        b = scanner.nextDouble();
        System.out.print("Kenar c: ");
        c = scanner.nextDouble();
        
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("HATALI GİRİŞ");
        }
        else if ((a + b)<= c ||(c + b)<= a || (a + c)<= b ) {
            System.out.println("ÜÇGEN DEĞİLDİR");
        }
        else {
            System.out.println("ÜÇGENDİR");
        }  
    }
}