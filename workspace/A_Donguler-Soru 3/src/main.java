/* zorluk: * * * * 
döngüler soru 3:
STEP1: Kullanıcıdan aldığınız sayının asal olup olmadığını ekrana bastırınız.*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayı;
        System.out.print("BİR SAYI GİRİNİZ: ");
        sayı=scanner.nextInt();
        int a = 0;
        
        for(int i = 1; i<=sayı ; i++){
            if(sayı % i == 0){
                a++;
            }
        }
        if(a==2){
            System.out.println("SAYI ASALDIR");
        }
        else{
            System.out.println("SAYI ASAL DEĞİLDİR.");
        }
    }
}