import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            int sayi, combi, sonuc =1;
            

            Scanner temp = new Scanner(System.in);
            System.out.println("üssü alınacak sayisi girin");
            sayi = temp.nextInt();

            System.out.println("üs değerini girin");
            combi = temp.nextInt();

           for(int i = 1;i<=combi;i++)
            sonuc *= sayi; 

        System.out.println("sonuc: "+sonuc);
                     
        }
    
    
}
