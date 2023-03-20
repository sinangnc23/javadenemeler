
import java.util.Scanner;  
public class Main {
     
    public static void main(String args[])    
    {  
    int i, j;  
    System.out.println("sütun ve satırları girin: ");  
    Scanner s = new Scanner(System.in);  
    int row = s.nextInt();  
    int column = s.nextInt();  
    int array[][] = new int[row][column];  
    System.out.println("matris elamanlarını giriniz:");  
    for(i = 0; i < row; i++)  
    {  
        for(j = 0; j < column; j++)   
            {  
            array[i][j] = s.nextInt();  
            System.out.print(" ");  
            }  
    }  
    System.out.println("tarnspoz öncesi ");  
    for(i = 0; i < row; i++)  
        {  
            for(j = 0; j < column; j++)  
            {  
            System.out.print(array[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
    System.out.println("transpoz sonrası ");  
    for(i = 0; i < column; i++)  
        {  
            for(j = 0; j < row; j++)  
            {  
                System.out.print(array[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
    }  
}


