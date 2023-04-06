
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner fiyat = new Scanner(System.in);
        while (true){
        System.out.println("ürün fiyatı giriniz.");
        double urunFiyat = fiyat.nextDouble();

        if (urunFiyat <= 1000.0 && urunFiyat > 0) {
            double kdvFiyat = urunFiyat * 0.18;
            urunFiyat *= 1.18;

            System.out.println("Kdv fiyatı: "+kdvFiyat);
            System.out.println("toplam fiyat: "+urunFiyat);

        }
        else if(urunFiyat > 1000){
            double kdvFiyat = urunFiyat * 0.08;
            urunFiyat *= 1.08;

            System.out.println("Kdv fiyatı: "+kdvFiyat);
            System.out.println("toplam fiyat: "+urunFiyat);

        }
        else
            System.out.println("hatalı değer girdiniz:"+urunFiyat);
    }}
}