import java.util.Scanner;

public class java001{
        public static void main(String[] args) {
            String username, pass;

            Scanner info = new Scanner(System.in);

            System.out.println("kullanıcı adi girin: ");
            username = info.next();
            System.out.println("paralo giriniz");
            pass = info.next();

            if(username.equals("java") && pass.equals("java"))
                System.out.println("giriş başarılı");
            else
                System.out.println("başarısızzz!!!! kullanıcı adı ya da şifre yanlış");
        
    }
    
}
