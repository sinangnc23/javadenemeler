
import java.util.Scanner;


public class java001{

    static boolean  palindromik(int sayi){
        int temp = sayi, revelsalnumber=0, lastnumber;
        while(temp!=0){

            lastnumber = temp%10;

            revelsalnumber = (revelsalnumber * 10)+lastnumber;
            temp /= 10;

        }
        if(sayi == revelsalnumber)
            return true;
        else
            return false;


    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int a = inp.nextInt();
            
            System.out.println(palindromik(a));
        
    
    }    
    
    
}
