
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int gecici;
    System.out.println("Dizinin boyutunu giriniz:");

    int n = input.nextInt();

    int [] dizi = new int[n];
  
    for (int i=0;i<n;i++){
        System.out.println((i+1)+". Elemanı giriniz");
        dizi[i] = input.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(dizi[j] > dizi[i]) {
                gecici = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = gecici;
            }
        }
    }
    
    input.close();
    for(int i=0;i<n;i++)
    System.out.print(dizi[i]+" ");

    
}

}
