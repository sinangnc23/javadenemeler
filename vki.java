// Vücut kitle endeks programı

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner uzunluk = new Scanner(System.in);
        System.out.println("Lüten boyunuzu metre cinsinden giriniz:");
        double boy = uzunluk.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        int kilo = uzunluk.nextInt();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksi: "+ vki);

    }
}
