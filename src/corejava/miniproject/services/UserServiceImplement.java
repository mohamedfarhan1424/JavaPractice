package corejava.miniproject.services;

import corejava.miniproject.model.Address;
import corejava.miniproject.model.User;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserServiceImplement implements  UserInterface {


    Scanner scanner = new Scanner(System.in);

    HashMap<Integer, User> userMap = new HashMap<>();

    HashMap<String,User> userEmailMap = new HashMap<>();

    public static final String red = "\u001B[31m";
    public static final String reset = "\u001B[0m";

    public static final String yellow ="\u001B[33m";

    public static boolean emailValid(String email) {
        final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(email).matches();
    }

    public static boolean validMobile(String mobile) {
        final Pattern Mobile_REGEX = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        return Mobile_REGEX.matcher(mobile).matches();
    }

    @Override
    public void addUser(){
        System.out.println("---Selected Choice: Create a new User ---");
        System.out.println("Enter the User Details:");
        System.out.println("\tID:");
        boolean flag = false;
        boolean error = false;
        int id =0;
        while(!flag){
            try{
                if(error){
                    scanner.nextLine();
                }
                id = scanner.nextInt();

                while(userMap.containsKey(id)){
                    System.out.println(yellow+"User with ID " + id + " already exists"+reset);
                    System.out.println("Enter different ID:");
                    id = scanner.nextInt();

                }
                flag = true;
            }
            catch(InputMismatchException e){
                System.out.println(red+"ID needs to be Integer Try Again!"+reset);
                error = true;
            }
        }

        System.out.println("\tName:");
        String name = scanner.next();
        System.out.println("\tEmail:");
        String email = scanner.next();
        boolean isValidEmail = emailValid(email);
        while(!isValidEmail){
            System.out.println(red+"Invalid Email Address"+reset);
            System.out.println("Enter a valid email address");
            email = scanner.next();
            isValidEmail = emailValid(email);
        }
        boolean isEmailExists = userEmailMap.containsKey(email);
        while(isEmailExists){
            System.out.println(yellow+"Email already exists"+reset);
            System.out.println("Enter a different email address");
            email = scanner.next();
            isValidEmail = emailValid(email);
            while(!isValidEmail){
                System.out.println(red+"Invalid Email Address"+reset);
                System.out.println("Enter a valid email address");
                email = scanner.next();
                isValidEmail = emailValid(email);
            }
            isEmailExists = userEmailMap.containsKey(email);
        }
        System.out.println("\tMobile Number:");
        String mobileNumber = scanner.next();
        boolean isValidMobile = validMobile(mobileNumber);
        while(!isValidMobile){
            System.out.println(red+"Invalid Mobile Number"+reset);
            System.out.println("Enter a valid mobile number");
            mobileNumber = scanner.next();
            isValidMobile = validMobile(mobileNumber);
        }
        System.out.println("\tAddress details:");
        System.out.println("\t\tPlotNo:");
        String plotNo = scanner.next();
        System.out.println("\t\tStreet:");
        String street = scanner.next();
        System.out.println("\t\tCity:");
        String city = scanner.next();
        System.out.println("\t\tState:");
        String state = scanner.next();

        Address address = new Address(plotNo,street,city,state);
        User user = new User(id,name,email,mobileNumber,address);
        userMap.put(user.getId(),user);
        userEmailMap.put(user.getEmail(),user);
        System.out.println("User Created Successfully");
    }

    @Override
    public void updateUser(){
        System.out.println("---Selected Choice: Update the User---");
        if(userMap.size() == 0){
            System.out.println(red+"There is no user to update"+reset);
            return;
        }
        System.out.println("Enter the user ID to update:");
        boolean flag = false;
        boolean error = false;
        int updateId =0;
        while(!flag){
            try{
                if(error){
                    scanner.nextLine();
                }
                updateId = scanner.nextInt();

                while(!userMap.containsKey(updateId)){
                    System.out.println(red+"There is no user with id " + updateId + " to update");
                    System.out.println("Enter different ID:");
                    updateId = scanner.nextInt();

                }
                flag = true;
            }
            catch(InputMismatchException e){
                System.out.println(red+"ID needs to be Integer Try Again!"+reset);
                error = true;
            }
        }
        User user2 = userMap.get(updateId);
        userEmailMap.remove(user2.getEmail());
        System.out.println("Enter the User Details:");
        System.out.println("\tName:");
        String name = scanner.next();
        System.out.println("\tEmail:");
        String email = scanner.next();
        boolean isValidEmail = emailValid(email);
        while(!isValidEmail){
            System.out.println(red+"Invalid Email Address"+reset);
            System.out.println("Enter a valid email address");
            email = scanner.next();
            isValidEmail = emailValid(email);
        }
        boolean isEmailExists = !Objects.equals(userMap.get(updateId).getEmail(), email) && userEmailMap.containsKey(email);
        while(isEmailExists){
            System.out.println(red+"Email  already exists"+reset);
            System.out.println("Enter a different email address");
            email = scanner.next();
            isValidEmail = emailValid(email);
            while(!isValidEmail){
                System.out.println(red+"Invalid Email Address"+reset);
                System.out.println("Enter a valid email address");
                email = scanner.next();
                isValidEmail = emailValid(email);
            }
            isEmailExists = !Objects.equals(userMap.get(updateId).getEmail(), email) && userEmailMap.containsKey(email);
        }
        System.out.println("\tMobile Number:");
        String mobileNumber = scanner.next();
        boolean isValidMobile = validMobile(mobileNumber);
        while(!isValidMobile){
            System.out.println(red+"Invalid Mobile Number"+reset);
            System.out.println("Enter a valid mobile number");
            mobileNumber = scanner.next();
            isValidMobile = validMobile(mobileNumber);
        }
        System.out.println("\tAddress details:");
        System.out.println("\t\tPlotNo:");
        String plotNo = scanner.next();
        System.out.println("\t\tStreet:");
        String street = scanner.next();
        System.out.println("\t\tCity:");
        String city = scanner.next();
        System.out.println("\t\tState:");
        String state = scanner.next();
        Address address = new Address(plotNo,street,city,state);
        User user = new User(updateId,name,email,mobileNumber,address);
        userMap.put(updateId,user);
        userEmailMap.put(email,user);
        System.out.println("User updated Successfully");
    }

    @Override
    public void deleteUser(){
        System.out.println("---Selected Choice: Delete the User ---");
        if(userMap.size() == 0){
            System.out.println(red+"There is no user to delete"+reset);
            return;
        }
        System.out.println("Enter the user ID to delete:");
        int deleteId = scanner.nextInt();
        User user = userMap.get(deleteId);
        userEmailMap.remove(user.getEmail());
        User deleted = userMap.remove(deleteId);
        if(deleted == null) {
            System.out.println(red+"There is no user with id " + deleteId+reset);
        }
        else {
            System.out.println("User with id " + deleteId + " deleted successfully");
        }
    }

    @Override
    public void getUserByEmail(){
        System.out.println("---Selected Choice: Get the User by Email---");
        if(userMap.size() == 0){
            System.out.println(red+"There is no user to retrieve"+reset);
            return;
        }
        System.out.println("Enter the email address of the user to retrieve:");
        String userEmail = scanner.next();
        boolean valid = emailValid(userEmail);
        while(!valid){
            System.out.println(red+"Invalid Email Address"+reset);
            System.out.println("Enter a valid email address");
            userEmail = scanner.next();
            valid = emailValid(userEmail);
        }
        User user = userEmailMap.get(userEmail);
        if(user == null){
            System.out.println(red+"There is no user with email " + userEmail+reset);
            return;
        }
        System.out.println("User with Email " + userEmail + " retrieved successfully");
        System.out.println(user);
    }

    @Override
    public void getUser(){
        System.out.println("---Selected Choice: Retrieve the User using ID---");
        if(userMap.size() == 0){
            System.out.println(red+"There is no user to retrieve"+reset);
            return;
        }
        System.out.println("Enter the user ID to retrieve:");
        int userId;
        try{
            userId = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println(red+"ID is not an integer"+reset);
            return;
        }

        User userNow =  userMap.get(userId);
        if(userNow == null) {
            System.out.println(red+"There is no user with id " + userId+reset);
            return;
        }
        System.out.println("User with id " + userId + " retrieved successfully");
        System.out.println(userNow);
    }

    @Override
    public void getAllUsers(){
        System.out.println("---Selected Choice: List all Users---");
        if(userMap.size() == 0){
            System.out.println(red+"There are no users"+reset);
            return;
        }
        for(User value : userMap.values()) {
            System.out.println("--------------------------------");
            System.out.println(value.toString());
        }
    }

}
