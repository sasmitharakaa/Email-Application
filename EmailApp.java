package EmailApp;

import java.security.PrivateKey;

public class EmailApp {
    public static void main(String[] args) {
       Email em1 = new Email("marry", "juan");
        System.out.println(em1.showInfo());

//       em1.setAlternateEmail("sas@gmail.com");
//        System.out.println(em1.getAlternateEmail());
    }
}
