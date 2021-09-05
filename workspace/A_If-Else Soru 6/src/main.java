/* zorluk: * * * *
if-else soru6:
STEP1: Kullanıcıdan 3 adet double türünde kenar uzunluğu alın. Ve bu 3 uzunluğun bir üçgen oluşturup oluşturamayacağını kontrol edin.
(soru 4te detaylı açıklaması bulunuyor)

STEP2: Eğer bu 3 sayı bir üçgen oluşturuyorsa oluşabilecek üçgenin bir dar açılı üçgen mi, dik açılı üçgen mi yoksa geniş açılı üçgen mi
oluşturduğunu ekrana yazdırınız.
ipucu: dik üçgende hipotenüsün karesinin uzunluğu, diğer iki kenarın karesinin uzunluklarına eşitti.
     örn:
input: 5/7/9                     ----------->  Tür: Geniş açılı
input: 8/15/17                  ----------->  Tür: Dik açılı
input: 2,5/2,5/2,5           ----------->  Tür: Dar açılı
input: 5/12/13                  ----------->  Tür: Dik açılı
input: 6/8/10,5               ----------->  Tür: Geniş  açılı
input: 6/8/9,5                 ----------->  Tür: Dar açılı*/

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
        else {
            if ((a + b)<= c ||(c + b)<= a || (a + c)<= b ) {
                System.out.println("ÜÇGEN DEĞİLDİR");
            }
            else {
                if (a >= b && a >=c){
                    double temp = c;
                    c = a;
                    a = temp;
                }  
                else if (b>= a && b >=c){
                    double temp = c;
                    c = b;
                    b = temp;
                }
                if ((c*c) < (b*b) + (a*a)) {
                    System.out.println("DAR AÇILI ÜÇGEN");
                }
                else if ((c*c) == (b*b) + (a*a)) {
                    System.out.println("DİK AÇILI ÜÇGEN");
                }
                else {
                    System.out.println("GENİŞ AÇILI ÜÇGEN");
                }
            }
        }   
    }
}