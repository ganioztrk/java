
/*zorluk: * * *
temel operatörler soru2:
STEP1: Kullanıcıdan 3 adet tamsayı alın. BUnları a, b ve c değişkenlerine atayın.

STEP2: Gerekli işlemleri yapıp. a'da b'nin, b'de c'nin, c'de a'nın değerini tutun. 
     örn:
input: x / y / z            ----------->  y / z / x
input: 1/2/3                ----------->  2 / 3 / 1
input: 6/2/4               ----------->  2 / 4 / 6
input: 3/8/8               ----------->  8 / 8 / 3
NOT:arkadaşlar bunu print(b + c+ a) şeklinde printleyerek yapmanızı istemiyorum. direkt olarak baştaki değişkenlerin içlerindeki değerlerin değişmesi lazım.*/

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a,b,c,temp1;
        
        System.out.println("3 TAM SAYI DEGERİ GİRİNİZ");
        
        System.out.print("a: ");
        a = scanner.nextInt();
        
        System.out.print("b: ");
        b = scanner.nextInt();
        
        System.out.print("c: ");
        c = scanner.nextInt();
        
        temp1 = a;
        a = b;
        b = c;
        c = temp1;
        
        System.out.println(a+" "+b+" "+c);
    }
}