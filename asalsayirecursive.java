
import java.util.Scanner;


public class java001{

    static boolean asalSayi(int sayi, int i){
        if (sayi < 2) return true;
        if (sayi == 2) return false;
        if (sayi % i == 0) return false;
        if (i * i > sayi) return true;

        return asalSayi(sayi, i + 1);
        
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("sayi giriniz:");
            int a = input.nextInt();
            if(a < 2)
            System.out.println("yanlış değer girdiniz");
            else
            System.out.println(asalSayi(a, 2));
       
    }
    
       
}
    
    
