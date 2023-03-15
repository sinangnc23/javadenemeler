import java.util.Scanner;

public class java001{
        public static void main(String[] args) {
            int sicaklik;

            Scanner temp = new Scanner(System.in);

            System.out.println("sıcaklık değeri giriniz: ");
            sicaklik = temp.nextInt();

            if(0<sicaklik && sicaklik <= 5)
            System.out.println("kayak yapabilirsiniz");

            else if(5<sicaklik && sicaklik <= 15)
            System.out.println("sinemaya gidebilirsiniz");

            else if(15<sicaklik && sicaklik <= 25)
            System.out.println("Pikniğe Gidebilirsiniz");

            else if(25<sicaklik )
            System.out.println("Yüzmeye gidebilirsiniz");

            
    }       
    
    
}
