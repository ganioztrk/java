/*
E F G H K L N P S
*/

public class main {
    public static void main(String[] args) {
        int k = 9;
        for(int i = 1 ; i <= k ; i++){
            for(int j = 1 ; j<= k ; j ++){
                if(i==1 || j==1 || i == k || (i == (k/2)+1 && j< (k / 2)+ 1)){
                   // System.out.print(i+""+j+" ");
                    System.out.print(" *");
                }
            }
                System.out.println("");
        }
    }
}