import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            int sayi, combi;
            double sonuc = 0.0;
            

            Scanner temp = new Scanner(System.in);
            System.out.println("hesaplanacak  sayi girin:");
            sayi = temp.nextInt();
            
            for(int i = 1; i <= sayi ;i++){
                sonuc += (1.0/i);
                 
            }
            System.out.println("sonuc: "+sonuc);
                    
        }
    
    
}
