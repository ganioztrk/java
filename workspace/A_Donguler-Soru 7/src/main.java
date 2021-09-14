/*zorluk: * * * * *
döngüler soru 7:
Aşağıdaki kod ile random sayı üretebilirsiniz:
---------------------------------------------
package rand_trial;                                // ken projenizi dahil ettiğiniz bu satır  import java.util.Random; satırının üstünde olmalı
import java.util.Random;                        // burada Random class'ını import ediyoruz random sayı üretme fonksiyonunu kullanabilmek için
public class Rand_trial {                         // bu projenizin ismi, sizde farklı olabilir
    public static void main(String[] args) {
        Random rand = new Random();               // burda class'tan bir nesne oluşturuyoruz
        int rand_int;                         // burada random sayımızı tutacak değişkeni tanımlıyoruz
        rand_int= rand.nextInt(1000);       // oluşturduğumuz nesnenin nextInt(1000) fonksiyonu ile 1-1000 arasında random bir sayı üretiyoruz 
        System.out.println(rand_int);           // bu kodu her çalıştırdığınızda size farklı bir sonuç verdiğini göreceksiniz
    }
}
---------------------------------------------
STEP1: Rastgele 10 tane sayı üretip bu 10 sayıyı ekrana yazdırın. 
STEP2: Bir üstte ürettiğiniz 10 rastgele sayının maks ve minimum olanları ekrana yazdırın.
STEP3: Bir üstte ürettiğiniz 10 rastgele sayının tek olanların toplamı ile çift olanların toplamını ekrana yazdırın. 
Hangisi daha büyükse ona göre 'tekler/çiftler daha büyük' şeklinde sonucu da yazdırın.
 
     örnek format:
Step1  için: 45 -- 7 -- 91 -- 123 -- 971 -- 244 -- 652 -- 374 --261 -- 328
Step2 için: Min: 7  -- Max: 971
Step3 için: Tekler toplamı: 1498  -- Çiftler toplamı: 1598 -- 'Çiftler daha büyük'*/

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int;
        rand_int = rand.nextInt(1000);
        //System.out.println(rand_int);
        int enbuyuk = 0;
        int enkucuk = 999;
        
        int tektoplam = 0;
        int cifttoplam = 0;
        
        for (int i = 0; i < 10; i++) {
            rand_int = rand.nextInt(1000);
            System.out.print( rand_int+"-" );
            
            if(rand_int > enbuyuk){
                enbuyuk = rand_int;
            }   
            if(rand_int < enkucuk){
                  enkucuk = rand_int;
            }
            if(rand_int % 2 == 0){
                cifttoplam+=rand_int;
            }
            else{
                tektoplam+=rand_int;
            }
        } 
        System.out.print("\nEn yuksek sayı:"+enbuyuk);
        System.out.print("\nEn kucuk sayı:"+enkucuk);
        System.out.print("\nTekler toplamı:"+tektoplam);
        System.out.print("\nCiftler toplamı:"+cifttoplam);
        if(cifttoplam > tektoplam){
            System.out.println("\n\nCiftler buyuktur");
        }
        else{
            System.out.println("\n\nTekler buyuktur.");
        }
    }
}