import java.util.Scanner;

/*zorluk: * * * *
döngüler soru 8:
STEP1: Kullanıcıdan kaç sayı gireceğini sorun. Ardından kullanıcıdan o kadar adet sayı alın. Bu sayıların toplamını ekrana bastırın.
STEP2: Bu sayıların çarpımını ve ortalamasını da ekrana bastırınız.
     örn:
Input:
    Kaç sayı gireceksiniz: 5
    1. sayıyı giriniz: 7
    2. sayıyı giriniz: 6
    3. sayıyı giriniz: 2
    4. sayıyı giriniz: 8
    5. sayıyı giriniz: 4
Output:
    Toplamları: 27
    Çarpımları: 2688
    Ortalama  : 5.4
not: ortlamanın virgüllü sayı olduğuna dikkat edin.*/

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayıadet;
        int toplam = 0;
        int çarpım = 1;
        double ortalama = 0;
        int sayı;
        
        System.out.println("Kac adet sayı gireceksiniz ?");
        sayıadet = scanner.nextInt();
        
        for(int i = sayıadet; i>0 ; i--){
            System.out.println("sayı giriniz: ");
            sayı = scanner.nextInt();
            toplam += sayı;
            çarpım *= sayı;
            ortalama = (double)toplam / (double)sayıadet;
        }
        System.out.println("toplam: " + toplam);
        System.out.println("ortamala: " + ortalama);
        System.out.println("çarpım: " + çarpım);
    }
}