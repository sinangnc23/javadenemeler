import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            int sayi, count = 0;
            double toplam = 0.0;
            

            Scanner temp = new Scanner(System.in);
            
            
            do{
            
            System.out.println("sayi giriniz:");
            sayi = temp.nextInt();

            if(sayi%2 == 0 && sayi%4 ==0){
                toplam += sayi;
                System.out.println("toplam: "+ toplam );
            }

            }while(sayi%2 != 1);

            

            






                     
        }
    
    
}
