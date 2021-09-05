
public class main {
    public static void main(String[] args) {
        //buraya kadar ögrendigimiz veri tiplerinin hepsi ilkel veri tipiydi
        //ilkel veri tipi üzerinde hiç bir metod bulunmayan veri tipi demek 
        //stringler ilkel veri tipi değildir.
        
        String a = "merhaba";
        System.out.println(a + " hoşgeldin koduum<3");
        
        String b = "Java";
        String c = " Programlama";
        String j = " dilidir";
        
        String toplam = b + c + j;
        
        System.out.println(toplam);
        
        String q = "selam";
        String z = "35";
        
        System.out.println(z);
        
        
        // stringlerde kullanılan iki karakter var
        // \t karakteri java görürse TAB kadar yani 4 space boşluk bırakır.
        // \n karakteri ise java tarafından görülünce direk alt satıra geçer.
        
        String k= "hoppp\nBurdayım\nama neden oradasın";
        
        System.out.println(k);
        
        
    }
}
