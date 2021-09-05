
import java.util.Scanner;


public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci İsmi giriniz: ");
        String isim1 = scanner.nextLine();
        
        System.out.print("İkinci İsmi giriniz: ");
        String isim2 = scanner.nextLine();
        
        System.out.print("Birinci Notu giriniz: ");
        double not1 = scanner.nextDouble();
        
        System.out.print("İkinci Notu giriniz: ");
        double not2 = scanner.nextDouble();
        
        boolean n1 = (not1 > 100 || not1 < 0); //BİRİNCİ NOTUN HATALI OLDUGU DURUM
        boolean n2 = (not2 > 100 || not2 < 0); //İKİNCİ NOTUN HATALI OLDUGU DURUM
                
        if (n1 && n2){
            System.out.println("HATALI NOT GİRDİNİZ");
        }
        else if (n1){
            System.out.println(isim1 + " Notu hatalı");
        }
        else if (n2){
            System.out.println(isim2 + " Notu hatalı");
        }
        
        else if (not1 > not2){
            System.out.println(isim1 + " Kazandınız");
        }
        else if (not2 > not1) {
            System.out.println(isim2 + " Kazandınız");
        }
        
        else if (not1 == not2){
            System.out.println(isim1 + " " +  isim2 +  " Nesiniz len sizzz");
        }
        
          
        
    }
}
