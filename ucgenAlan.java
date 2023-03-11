import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner uzunluk = new Scanner(System.in);
        System.out.println("Üçgenin ilk kenarını giriniz:");
        int a = uzunluk.nextInt();

        System.out.println("Üçgenin ikinci kenarını giriniz:");
        int b = uzunluk.nextInt();

        System.out.println("Üçgenin üçüncü kenarını giriniz:");
        int c = uzunluk.nextInt();

        double u = (a + b +c) / 2;
        double alan = u * (u - a) * (u - b) * (u - c);

        alan = Math.sqrt(alan);

        System.out.println("Üçgen alanı: " +alan);
    }
}
