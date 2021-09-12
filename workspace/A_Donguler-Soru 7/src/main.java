import java.util.Random;


public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        
        
        int enbuyuk = 0;
        int enkucuk = 999;
        
        for(int i = 0 ; i<10 ; i++){
            int randomsayı = rand.nextInt(1000);
            
            if(enbuyuk<randomsayı){
                enbuyuk = randomsayı;
            }
            if(enkucuk>randomsayı){
                enkucuk = randomsayı;
            }
            System.out.print(randomsayı+ "-"); 
        }
        System.out.println("\nEn buyuk sayı: " + enbuyuk);
        System.out.println("En kucuk sayı: " + enkucuk);
    }
}