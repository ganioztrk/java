
import java.util.Scanner;

/*2 sayı al 
kucukten buyuge kadar olanların hepsini topla bastır
*/

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a,b,temp,toplam;
        System.out.print("A sayısı: ");
        a = scanner.nextInt();
        System.out.print("B sayısı: ");
        b = scanner.nextInt();
        
        toplam=0;
        
        if(b<a){
           temp =a;
           a=b;
           b=temp;
        }
        for(int i =a; i<=b ; i++ ){
            toplam += i;
        }
        System.out.println(toplam);
    }
}
