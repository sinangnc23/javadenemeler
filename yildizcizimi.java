import java.util.Scanner;



public class java001{
    public static void main(String[] args) {
		int satir = 9;
        
        for (int i = 1; i <= satir; i++){
            for (int k = 1; k <= satir - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = satir - 1; i >= 1; i--){
            for (int j = 1; j <= satir - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        }    
    
    
}
