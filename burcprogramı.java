import java.util.Scanner;



public class java001{
        public static void main(String[] args) {
            int day;

            Scanner temp = new Scanner(System.in);

            System.out.println("Hangi ayda doğdunuz: ");
            String ay = temp.next();

            System.out.println("doğdunuz gün: ");
            day = temp.nextInt();

            if (1<=day && day <= 31){

                if(ay.equals("ocak") && day <= 21)
                    System.out.println("Oğlak Burcu");
                else if(ay.equals("ocak") && day > 21)
                    System.out.println("Kova Burcu");

                else if(ay.equals("subat") && day <= 19)
                    System.out.println("kova burcu");
                else if(ay.equals("subat") && day >19)
                    System.out.println("Balık burcu");

                else if(ay.equals("mart") && day <= 20)
                    System.out.println("Balık burcu");
                else if(ay.equals("mart") && day > 20)
                    System.out.println("koç burcu");

                else if(ay.equals("nisan") && day <= 20)
                    System.out.println("koç burcu");
                else if(ay.equals("nisan") && day > 20)
                    System.out.println("Boğa burcu");

                else if(ay.equals("mayis") && day <=21 )
                    System.out.println("boğa burcu");
                else if(ay.equals("mayis") && day >21)
                    System.out.println("İkizler burcu");

                else if(ay.equals("haziran") && day <= 22)
                    System.out.println("İkizler Burcu");
                else if(ay.equals("haziran") && day > 22)
                    System.out.println("yengeç burcu");

                else if(ay.equals("temmuz") && day <= 22)
                    System.out.println("yengeç burcu");
                else if(ay.equals("temmuz") && day > 22);
                //System.out.println("Aslan burcu");

                else if(ay.equals("agustos") && day <= 22)
                    System.out.println("Aslan burcu");
                else if(ay.equals("agustos") && day > 22)
                    System.out.println("Başak burcu");

                else if(ay.equals("eylul") && day <= 22)
                    System.out.println("Başak burcu");
                else if(ay.equals("eylul") && day > 22)
                    System.out.println("Terazi burcu");


                else if(ay.equals("ekim") && day <= 22)
                    System.out.println("Terazi Burcu");
                else if(ay.equals("ekim") && day > 22)
                    System.out.println("Akrep burcu");

                else if(ay.equals("kasim") && day <= 21)
                    System.out.println("Akrep burcu");
                else if(ay.equals("kasim") && day > 21)
                    System.out.println("Yay burcu");

                else if(ay.equals("aralik") && day <= 22)
                    System.out.println("Yay burcu");
                else if(ay.equals("aralik") && day > 22)
                    System.out.println("Oğlak burcu");
                
                else
                    System.out.println("yanlış ay");

            }

            

            

            
    }       
    
    
}
