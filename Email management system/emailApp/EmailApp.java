package emailApp;

public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email("kavinda", "medagoda");
        email.getInfo();
        email.setAltEmail("kbm@gmail.com");
        email.getInfo();
        email.setAltPassword("ASQ@#JDKS23");
        email.getInfo();

    }
}