import java.util.Scanner;

/*zorluk: * * * * * * *
döngüler soru 6:
Teori:eğer bir x sayısı tekse 3x+1, çiftsa x/2 işlemleri uygulanarak x sayısı güncellendiği sürece bu işlem yeterince yapılırsa en sonunda 1'e ulaşılır.
     örn: x= 17
          17 --- 52 --- 26 --- 13 --- 40 --- 20 --- 10 --- 5 --- 16 --- 8 --- 4 --- 2 --- 1
STEP1: Kullanıcıdan bir sayı isteyin ve bu sayının bu şartı sağlayana kadar uğradığı tüm değişimleri ekrana bastırın.
STEP2: 1'den 100'e kadar bütün sayıların bu şartı sağladığını teyit edin. Bu sefer sayının uğradığı tüm değişimleri ekrana bastırmayın. 
Sayının bu süreçte uğradığı en yüksek sayıyı ekrana bastırın sadece. (yukarıdaki 17 örneği için sadece 52'yi bastırın yani) Bu STEP'te kullanıcıdan 
aldığınız sayıyı kullanmayacaksınız.
     örn:
Input: 19
Output:
    Step1  için: 19 --- 58 --- 29 --- 88 --- 44 --- 22 --- 11 --- 34 --- 17 --- 52 --- 26 --- 13 --- 40 --- 20 --- 10 --- 5 --- 16 --- 8 --- 4 --- 2 --- 1
    Step2 için: 19 için max nokta: 88    // bu kısmı 2den 100e kadar her sayı için yazdıracaksınız STEP2'de
not:sorunun STEP1 kısmı 4 yıldız, sorunun asıl zor kısmı STEP2.Bunu çözebilirseniz for ve while döngülerini GAYET İYİ bir şekilde anlamışsınız demektir.
Şuan sizin için zor bir soru, danışmaktan çekinmeyin.*/

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayı;
        
        int enbuyuk = 0;
        
        System.out.print("bir sayı gir:");
        
        sayı = scanner.nextInt();
        
        while(sayı > 1){
            if(sayı % 2 == 0){
                sayı /= 2;
            }
            else{
                sayı *=3;
                sayı++;
            }
            if(sayı > enbuyuk){
                enbuyuk = sayı;
            }
            System.out.println(sayı);
        }
        System.out.println("en buyuk sayı: " + enbuyuk);
    }
}