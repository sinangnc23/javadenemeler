import java.util.Scanner;


public class java001{
    public static void main(String[] args) {

            int first, toplam = 0, min = 0, i, second;
		
            Scanner temp = new Scanner(System.in);
            
            System.out.println("basamak giriniz:");
            first = temp.nextInt();

            for(i =1 ; i < first;i++){
                for(int j = i;j<2*(i-1);j++)
                    System.out.print(" ");
                for(int k=1;k<2*(first - i);k++)
                    System.out.print("*");
                System.out.println();    
            }
            
            
        
    
    }    
    
    
}
