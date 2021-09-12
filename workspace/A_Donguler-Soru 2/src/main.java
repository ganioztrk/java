/*zorluk: * * *
döngüler soru 2:
STEP1: Ekrana karesi 300'den küçük olan bütün pozitif tamsayıları yazdırınız.*/


public class main {
    public static void main(String[] args) {
        int i;
        
        for(i = 1 ; (i*i) <= 300 ;i++){
            System.out.println("Karesi 300 altı tam sayılar: " + i);
        }
    }
}