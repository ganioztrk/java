/*STEP1: Ekrana 1 ile 20 arasındaki bütün asal sayıların karelerini yazdırınız.
     örnek format:
sayı: x     karesi: x^2
sayı:2     karesi:4
sayı:13    karesi:169*/

public class main {
    public static void main(String[] args) {
        int sayi;
        
        for(sayi=2;sayi<=20;sayi++){
        
            int kontrol = 0;
            for (int i = 2; i < sayi; i++){
            
               if (sayi % i == 0){
                
                    kontrol = 1;
                } 
            }
                
            if(kontrol==0)
            {
                System.out.print(sayi +"    Karesi:"+(sayi*sayi) + "\n");
            }
        }
    }    
}