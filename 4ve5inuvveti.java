import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            int sayi, counti = 0, count =0, j = 1;
            

            Scanner temp = new Scanner(System.in);
            System.out.println("bir sayi girin");
            sayi = temp.nextInt();

            for (int i = 1; i < sayi; i *=4){
                counti++;
                j *= 5;
                if(j<sayi)
                    count++;
            }
            System.out.println("5 in kuvveti "+count + ", 4 ün kuvveti " + counti);

                     
        }
    
    
}
