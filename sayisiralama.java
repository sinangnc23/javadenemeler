import java.util.Scanner;

public class java001{
        public static void main(String[] args) {
            int first, second, thirt;

            Scanner temp = new Scanner(System.in);

            System.out.println("ilk sayiyi giriniz: ");
            first = temp.nextInt();

            System.out.println("ikinci sayiyi giriniz: ");
            second = temp.nextInt();

            System.out.println("üçüncü sayiyi giriniz: ");
            thirt = temp.nextInt();

            if(first > second && second > thirt)
            System.out.println("a > b > c");

            if(first > thirt && thirt > second)
            System.out.println("a > c > b");

            else if (second > first && first > thirt )
            System.out.println("b > a > c");

            else if (second > thirt && thirt > first )
            System.out.println("b > c > a");

            else if (thirt > second && second > first)
            System.err.println("c > b > a");

            else if (thirt > first && first > second)
            System.err.println("c > a > b");

            

            
    }       
    
    
}
