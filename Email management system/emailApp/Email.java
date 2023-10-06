package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private String companyName = "KBM";
    private int mailBoxCapacity;
    private int passwordLength = 10;
    private String alternateEmail;

    // constructor to receive the firs name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // call method to get the department
        this.department = setDep();

        // call method to generate random password
        this.password = randomPassword(passwordLength);

        // return email
        email = firstName + "." + lastName + "@" + department + "." + companyName + ".com";
    }

    // ask for department
    private String setDep() {
        System.out.print(
                "===Choose a department code from below==== \n\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none \n Enter the code:");
        Scanner input = new Scanner(System.in);
        int department = input.nextInt();
        if (department == 1) {
            return "Sales";
        } else if (department == 2) {
            return "Dev";
        } else if (department == 3) {
            return "Acc";
        } else {
            return "";
        }
    }

    // generate random password

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUV123456789!@#$%&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // set alternative email
    public void setAltEmail(String email) {
        this.email = email;
    }

    // change the password
    public void setAltPassword(String password) {
        this.password = password;
    }

    public void getInfo() {
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
