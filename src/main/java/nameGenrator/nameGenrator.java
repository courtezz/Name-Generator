package nameGenrator;

import java.util.Scanner;

public class nameGenrator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = myScanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = myScanner.nextLine();


        System.out.print("Enter your last name: ");
        String lastName = myScanner.nextLine();

        System.out.print("Enter a suffix(if applicable): ");
        String suffix = myScanner.nextLine();

        System.out.println("your full name: ");

        if(middleName.isBlank()) {
            if (suffix.isBlank()) {

                System.out.println(firstName.trim() + " " + lastName.trim());


            } else {
                System.out.println(firstName.trim() + " " + lastName.trim() + " " + suffix.trim() + " ");
            }

        }
        else {
            if (suffix.isBlank()) {

                System.out.println(firstName.trim() + " " +  middleName + " " + lastName.trim());


            } else {
                System.out.println(firstName.trim() + " " + middleName + " " + lastName.trim() + " " + suffix.trim() + "");
            }
        }
    }
}
