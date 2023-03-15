import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            int mesafe, yas, tercih;
            double tutar=0.0;

            Scanner temp = new Scanner(System.in);
            
            System.out.println("Uçuş mesafesini girin: ");
            mesafe = temp.nextInt();
            System.out.println("yaşınızı giriniz.");
            yas = temp.nextInt();
            System.out.println("1. Tek Yön 2. Çift Yön");
            tercih = temp.nextInt();

            if(0<mesafe && 0<yas && 0<tercih){
                tutar = mesafe * 0.1;

                if(yas<12)
                    tutar *= 0.5;
                else if(12 < yas && yas < 24)
                    tutar *= 0.9;
                else if(yas >= 65)
                    tutar *= 0.7;
                
                if(tercih == 2)
                    tutar *=0.8;

            }
            else
            System.out.println("Hatalı veri girdiniz");

            System.out.println("Toplam tutar: "+ tutar);
        }
    
    
}
