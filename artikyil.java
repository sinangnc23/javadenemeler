import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            int tarih;
            

            Scanner temp = new Scanner(System.in);
            System.out.println("Yıl giriniz:");
            tarih = temp.nextInt();

            

            if(tarih%4 ==0)
                System.out.println("artık yıldasınız");
            else
            System.out.println("artık yılda değilsiniz");






            
            
        }
    
    
}
