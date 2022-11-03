package corejava.miniproject;

import corejava.miniproject.services.UserInterface;
import corejava.miniproject.services.UserServiceImplement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int choice = 0;
        int flag = 0;
        UserInterface services = new UserServiceImplement();


        while (choice != 7){
            try {
                if(flag == 1){
                     scanner.nextLine();
                }
                System.out.println("Enter the Choice:");
                System.out.println("\t 1. Create a new User");
                System.out.println("\t 2. Update the User");
                System.out.println("\t 3. Delete the User");
                System.out.println("\t 4. Retrieve the User using ID");
                System.out.println("\t 5. Retrieve the User using EmailId");
                System.out.println("\t 6. List all Users");
                System.out.println("\t 7. Exit");
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Enter the Choice in Number");
                flag = 1;
                continue;
            }

            switch (choice) {
                case 1:
                    services.addUser();

                    break;
                case 2:
                    services.updateUser();

                    break;
                case 3:
                    services.deleteUser();
                    break;
                case 4:
                    services.getUser();
                    break;
                case 5:
                    services.getUserByEmail();
                    break;
                case 6:
                    services.getAllUsers();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Please choose the correct choice");

            }
        }
        System.out.println("Exited successfully");

    }
}
