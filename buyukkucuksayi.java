import java.util.Scanner;


public class java001{
    public static void main(String[] args) {

            int first, max = 0, min = 0, i, second;
		
            Scanner temp = new Scanner(System.in);
            
            System.out.println("kaç sayı gireceksiniz:");
            first = temp.nextInt();
            for(i=1;i<=first;i++){
                System.out.println(i+". sayiyi giriniz:"); 
                second = temp.nextInt();
                if (min == 0 && max == 0){
                    max = second;
                    min = second;
                }
                else if(second < min)
                    min =second;
                else if(second > max)
                    max = second;

            }

            System.out.println("En büyük sayı: "+max+" en küçük sayı: "+min);
            
        
    
    }    
    
    
}
