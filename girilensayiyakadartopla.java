import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            int sayi, count = 0;
            double toplam = 0.0;
            

            Scanner temp = new Scanner(System.in);
            System.out.println("sayi giriniz:");
            sayi = temp.nextInt();
            

            for(int i= 1; i<=sayi; i++){
                if(i%3 == 0 || i%4 == 0)
                {
                    toplam += i;
                    System.out.println(i);
                    count++;
                }

            }
            
            double ortalama = toplam /count;

            System.out.println("ortalama: "+ ortalama);

            

            






            
            
        }
    
    
}
