import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            int sayi, combi, sonuc =1;
            String a;

            Scanner temp = new Scanner(System.in);
            System.out.println("hesaplanacak  sayi girin (1000-9999 arasında)");
            a = temp.next();
            System.out.println(a.length());
            if(a.length()>3 && a.length() < 5){
            int b = Character.getNumericValue(a.charAt(0));
            int c = Character.getNumericValue(a.charAt(1));
            int d = Character.getNumericValue(a.charAt(2));
            int e = Character.getNumericValue(a.charAt(3));
            int toplam = b + c + d + e;
            System.out.println(toplam);}

            else
            System.out.println("aralık dışında sayı girdiniz");

                     
        }
    
    
}
