import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner baris = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz!");
        int a = baris.nextInt();
        
        System.out.println("ikinci sayiyi giriniz!");
        int b = baris.nextInt();
        
        System.out.println("islem giriniz:"
        +"\n1.Toplama \n2.Cikarma \n3.Carpma \n4.Bolme");
        int c = baris.nextInt();
        
        switch(c){
            case 1:
                System.out.println((a+b));
                break;
            case 2:
                System.out.println((a-b));
                break;
            case 3:
                System.out.println((a*b));
                break;
            case 4:
                System.out.println((a/b));
                break;
            default:
            System.out.println("hatali secim");
        }
        
        
    }
}
