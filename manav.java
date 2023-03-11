import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner uzunluk = new Scanner(System.in);
        System.out.println("    Armut : 2,14 TL\n" +
                "    Elma : 3,67 TL\n" +
                "    Domates : 1,11 TL\n" +
                "    Muz: 0,95 TL\n" +
                "    Patlıcan : 5,00 TL");

        System.out.println("Armut kaç kilo:");
        int armutkg = uzunluk.nextInt();

        System.out.println("Elma kaç kilo:");
        int elmakg = uzunluk.nextInt();

        System.out.println("Domates kaç kilo:");
        int domateskg = uzunluk.nextInt();

        System.out.println("Muz kaç kilo:");
        int Muzkg = uzunluk.nextInt();

        System.out.println("Patlıcan kaç kilo:");
        int Patlıcankg = uzunluk.nextInt();

        double toplam = ((armutkg * 2.14)+(elmakg * 3.67)+(domateskg * 1.11)+ (Muzkg * 0.95)+(Patlıcankg * 5));
        System.out.println("toplam fiyat: "+toplam);

    }
}
