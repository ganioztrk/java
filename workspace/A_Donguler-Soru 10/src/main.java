/* zorluk: * * *
döngüler soru 10:
STEP1: Kullanıcıdan 2 adet sayı alın. Bu 2 sayının çarpımını hiç çarpma operatörü ("*") kullanmadan döngüler yardımı ile hesaplayıp ekrana yazdırın. 
(Diğer matematiksel operatörleri kullanabilirsiniz) (Lütfen a/(1/b) yapmayın!! Döngüler ve  toplama operatörünü kullanın)
örn:
Input: 5 , 8
Output: 40*/ 


import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Bir sayı giriniz: ");
        a = scanner.nextInt();
        
        int b;
        System.out.print("Bir sayı giriniz: ");
        b = scanner.nextInt();
        
        int carpım = 0;
        
        for(int i = 1 ; i<= b ; i++){
            carpım = a + carpım;
        }
        System.out.println(carpım);
    }
}