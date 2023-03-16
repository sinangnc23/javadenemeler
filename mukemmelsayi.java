import java.util.Scanner;


public class java001{
    public static void main(String[] args) {

            int first, toplam = 0, min = 0, i, second;
		
            Scanner temp = new Scanner(System.in);
            
            System.out.println("sayı giriniz:");
            first = temp.nextInt();

            for(i =1 ; i < first;i++){
                if(first%i==0)
                toplam+=i;

            }
            if(toplam == first)
            System.out.println(first+" Mükemmel sayi");
            else
            System.out.println(first+" Mükemmel sayı değildir");

            
        
    
    }    
    
    
}
