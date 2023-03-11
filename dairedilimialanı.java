import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner uzunluk = new Scanner(System.in);
        System.out.println("Yarı çap giriniz:");
        int yaricap = uzunluk.nextInt();

        System.out.println("Açı giriniz:");
        int aci = uzunluk.nextInt();

        double pi = 3.14;
        double alan = (pi * (yaricap * yaricap) * aci) / 360;

        System.out.println("Daire dilimin alanı: "+ alan);
        
    }
}
