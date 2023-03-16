import java.util.Scanner;


public class java001{
    public static void main(String[] args) {

            int first, ilk=0, second = 0, toplam=0, i, prev=0;
		
            Scanner temp = new Scanner(System.in);
            
            System.out.println("sayi giriniz:");
            first = temp.nextInt();

            for(i =0 ; i < 3;i++){
                
                toplam = ilk + second;
                prev = ilk;
                ilk = toplam;
                System.out.print(toplam+" ");
                second = 1;

                  
            }

            for(i=4;i<first;i++)
            {
                toplam = prev + ilk;
                prev = ilk;
                ilk = toplam;
                System.out.print(toplam+" ");

            }
            
            
        
    
    }    
    
    
}
