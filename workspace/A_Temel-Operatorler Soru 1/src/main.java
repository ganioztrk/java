
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        // STEP 1
        int sayi;
        
        System.out.print("PLEASE ENTER A FOUR DIGIT NUMBER: ");
        sayi = scanner.nextInt();
        
        if (sayi<= 999 || sayi >= 10000){
            System.out.println("INVALID NUMBER, FOUR DIGIT PLEASE.");
        }
        
        else {
            
            int bb;
            int ob;
            int yb;
            int bnb;

            bb = sayi % 10;

            ob = (sayi / 10) % 10;

            yb = ((sayi / 10) / 10) % 10;

            bnb = (((sayi / 10) / 10) / 10 ) % 10;

            int toplam = bb+ob+yb+bnb;

            System.out.println("TOTAL OF NUMBERS: " + toplam );

            int ters;
            ters = (bb*1000) + (ob*100) + (yb*10) + bnb;

            System.out.println("RESERVE: " + ters);

        
    }
}
}
