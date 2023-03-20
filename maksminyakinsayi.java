
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("-2 ile 101 arasında bir sayi giriniz:");

    int n = input.nextInt();
    input.close();
    int[] list = {56, 34, 1, 8, 101, -2, -33};
    int min = -33,max=101;
   

    for(int i=0;i<list.length;i++){
        

        if(list[i] <= n){
            if (!(list[i]<min))
                min = list[i];
            
            
        }
        else if(list[i] >= n){
            if (!(list[i]>max))
                max = list[i];

        }
        
    }
    System.out.println("min: "+min);
    System.out.println("max: "+max);
}

}
