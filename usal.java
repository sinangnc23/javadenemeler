
import java.util.Scanner;


public class java001{

    static int usAl(int taban ,int us){
        
        if(us == 0)
        return 1;
        else 
        return taban *= usAl(taban, us-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("taban değeri giriniz:");
        int a = input.nextInt();
        System.out.println("üs kuvveti giriniz");
        int b = input.nextInt();
        System.out.println(usAl(a, b));
    }
    
       
}
    
    
