import java.util.Scanner;

public class java001{
        public static void main(String[] args) {
            int mat, fizik, turkce, muzik, kimya;

            Scanner not = new Scanner(System.in);

            System.out.println("Matematik notu giriniz");
            mat = not.nextInt();

            System.out.println("Fizik notu giriniz");
            fizik = not.nextInt();

            System.out.println("Türkçe notu giriniz");
            turkce = not.nextInt();

            System.out.println("Müzik notu giriniz");
            muzik = not.nextInt();

            System.out.println("kimya notu giriniz");
            kimya = not.nextInt();
        
            int toplam = 0;
            int count = 0;
            if(0<mat && mat <= 100)
                toplam += mat;
                count++;
            
            if(0<turkce && turkce <= 100)
                toplam += turkce;
                count++;

            if(0<fizik && fizik <= 100)
                toplam += fizik;
                count++;

            if(0<kimya && kimya <= 100)
                toplam += kimya;
                count++;

            if(0<muzik && muzik <= 100)
                toplam += muzik;
                count++;

            double ortalama = toplam / count;
            
            if (ortalama > 55.0)
            System.out.println("Geçtiniz ortalamanız: "+ ortalama);
            else
            System.out.println("kaldınız ortalamnız: "+ ortalama);
    }       
    
    
}
