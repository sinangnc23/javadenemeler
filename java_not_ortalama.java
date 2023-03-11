import java.util.Scanner;

class firstHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("mat notu: ");
        int mat = input.nextInt();
        
        System.out.println("tarih notu: ");
        int tarih = input.nextInt();
        
        System.out.println("Turkce notu: ");
        int turkce = input.nextInt();
        
        System.out.println("Muzik notu: ");
        int muzik = input.nextInt();
        
        System.out.println("Beden Egitimi notu: ");
        int beden = input.nextInt();
        
        System.out.println("Biyoloji notu: ");
        int biyo = input.nextInt();
        
        double ortalama = (tarih + mat + turkce + muzik + beden + biyo) / 6;
        
        System.out.println(ortalama);
        
        if (ortalama > 60)
            System.out.println("gectiniz notunuz: "+ ortalama );
        else
            System.out.println("kaldiniz notunuz: "+ ortalama);
    }
}
