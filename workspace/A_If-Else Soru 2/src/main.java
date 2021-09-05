
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
       
        //STEP 1 ANSWER
        double hacim;
        double agirlik;
        double en;
        double boy;
        double yukseklik;
        double ozkutle;
        
        int agirlikcinsi;
        int uzunlukcinsi;
        
        System.out.print("LUTFEN AGIRLIK CINS SECINIZ \n kg için 1 \n gr için 2 \n:  ");   
        agirlikcinsi = scanner.nextInt();
        
        
        System.out.print("LUTFEN UZUNLUK CINS SECINIZ \n metre için 1 \n cm için 2 \n: ");
        uzunlukcinsi = scanner.nextInt();
        
        
        System.out.print("agirlik deger giriniz: ");
        agirlik = scanner.nextDouble();
        
        System.out.println("uzunluk degeri en-boy-yukseklik girin:");
        System.out.print("en: ");
        en = scanner.nextInt();
        System.out.print("boy: ");
        boy = scanner.nextInt();
        System.out.print("yukseklik: ");
        yukseklik = scanner.nextInt();
        
        if (agirlikcinsi == 1) {
            agirlik = agirlik*1000;
             
        }
        if (uzunlukcinsi == 1) {
            en = en * 100;
            boy = boy * 100;
            yukseklik = yukseklik * 100;
        }
        
        hacim = en * boy * yukseklik;
       
        ozkutle = agirlik / hacim;
           
        System.out.println("ozkutle: " + ozkutle);
        
        // STEP 2 ANSWER
        if(ozkutle < 0.3) {
            System.out.println("cisim bir gazdır");
                    }
        else if (ozkutle >= 0.3 && ozkutle <= 2) {
            System.out.println("cisim bir sıvıdır.");
        }
        else if (ozkutle > 2) {
            System.out.println("cisim bir katıdır.");
    }
}
}
