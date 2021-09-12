import java.util.Scanner;

/*zorluk: * * * * *
döngüler soru 5:*
STEP1: Kullanıcının girdiği sayının basamaklar toplamını ekrana yazdırınız. 
     örnek format:
sayı: 543       output:12
sayı:2357      output:17
sayı:13            output:4
sayı:23456   output:20*/


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");

        int sayı = scanner.nextInt();
        int toplam = 0;
        int basamak;

        for(; sayı > 0 ; sayı /= 10){
            basamak = sayı % 10;
            toplam += basamak;
        }
        System.out.println("toplam : " + toplam);
    }
}