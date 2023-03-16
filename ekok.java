import java.util.Scanner;



public class java001{
    public static void main(String[] args) {

            int first, second, i=1;
		
            Scanner temp = new Scanner(System.in);
            
            System.out.println("ilk sayiyi girin:");
            first = temp.nextInt();
            System.out.println("İkinci sayiyi girin:");
            second = temp.nextInt();

            while(i<=first*second){
                if(i%first ==0 && i%second==0){
                    System.out.println("ekok= "+i);
                    break;
                }
                i++;
            }
        
    
    }    
    
    
}
