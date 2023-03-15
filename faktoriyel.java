import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            long sayi, combi, N=1, r=1, nr=1;
            double sonuc = 0.0;

            Scanner temp = new Scanner(System.in);
            System.out.println("eleman sayisi girin");
            sayi = temp.nextInt();

            System.out.println("kobinasyon sayisi girin");
            combi = temp.nextInt();

            if(combi < sayi) {
            
            for(int i =1; i<=sayi;i++){
                N *= i;
            }

            for(int i =1; i<=combi;i++){
                r *= i;
            }

            for(int i =1; i<=(sayi - combi);i++){
                nr *= i;
            }
        }
        else
        System.out.println("yanlış değerler girdiniz");

        sonuc = N / (r * nr);

        System.out.println("sonuc: "+sonuc);
                     
        }
    
    
}
