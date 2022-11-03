package corejava.miniproject.services;

import corejava.miniproject.model.Address;
import corejava.miniproject.model.User;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserServiceImplement implements  UserInterface {

    int id=0;
    Scanner scanner = new Scanner(System.in);

    HashMap<Integer, User> userMap = new HashMap<>();

    HashMap<String,User> userEmailMap = new HashMap<>();

    public static final String red = "\u001B[31m";
    public static final String reset = "\u001B[0m";

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
        id=id+1;
        System.out.println("---Selected Choice: Create a new User ---");
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
        boolean isEmailExists = userEmailMap.containsKey(email);
        while(isEmailExists){
            System.out.println(red+"Email is already exists"+reset);
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
    }

    @Override
    public void updateUser(){
        System.out.println("---Selected Choice: Update the User---");
        System.out.println("Enter the user ID to update:");
        int updateId = scanner.nextInt();
        if(!userMap.containsKey(updateId)){
            System.out.println(red+"There is no user with id " + updateId + " to update");
            return;
        }
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
        boolean isEmailExists = userEmailMap.containsKey(email);
        while(isEmailExists){
            System.out.println(red+"Email is already exists"+reset);
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
        userMap.put(updateId,user);
        userEmailMap.put(email,user);
    }

    @Override
    public void deleteUser(){
        System.out.println("---Selected Choice: Delete the User ---");
        System.out.println("Enter the user ID to delete:");
        int deleteId = scanner.nextInt();
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
        System.out.println("Enter the user ID to retrieve:");
        int userId = scanner.nextInt();
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
