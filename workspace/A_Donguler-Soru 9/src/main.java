import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayı;
        int toplam = 0;
        double ortalama = 0;
        int kontrol = -1;
        
        while(true){
            System.out.print("BİR SAYI GİRİNİZ : ");
            sayı = scanner.nextInt();
            kontrol ++;
            
            toplam = toplam += sayı;
            ortalama = (double)toplam / (double)kontrol;
            
            if(sayı == 0){
                break;
            }
        }
        System.out.println("Girilen sayılar toplamı: " + toplam);
        System.out.println("Girilen sayılar ortalaması: " + ortalama);
        System.out.println("Girilen tomlam terim sayısı: " + kontrol);
    }
}