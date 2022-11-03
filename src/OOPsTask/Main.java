package OOPsTask;


import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Enter the number of clients");
        int clients = scanner2.nextInt();


        ArrayList<Client> clientArrayList = new ArrayList<>();
        for(int i=1;i<=clients;i++){
            System.out.println("--------Enter the Details of Client"+i+"---------");

            System.out.println("Enter the name of Client"+i+":");
            String clientName1 = scanner.nextLine();
            System.out.println("Enter the age of Client"+i+":");
            int clientAge1 = scanner2.nextInt();
            System.out.println("Enter the mobileNo of Client"+i+":");
            String clientMobileNo1 = scanner.nextLine();
            System.out.println("Enter the address of Client"+i+":");
            String clientAddress1 = scanner.nextLine();
            System.out.println("Enter the plotNo of Client"+i+":");
            int clientPlotNo1 = scanner2.nextInt();
            System.out.println("Enter the city of Client"+i+":");
            String clientCity1 = scanner.nextLine();
            System.out.println("Enter the state of Client"+i+":");
            String clientState1 = scanner.nextLine();
            System.out.println("Enter the pinCode of Client"+i+":");
            int clientPinCode1 = scanner2.nextInt();
            System.out.println("Enter the CompanyName of Client"+i+":");
            String clientCompanyName1 = scanner.nextLine();
            System.out.println("Enter the CompanyAddress of Client"+i+":");
            String clientCompanyAddress1 = scanner.nextLine();

            Client client = new Client(clientName1,clientAge1,clientMobileNo1,clientAddress1,clientPlotNo1,clientCity1,clientState1,clientPinCode1,clientCompanyName1,clientCompanyAddress1);
           clientArrayList.add(client);
        }

        System.out.println("----------------------------------------------");

        System.out.println("Enter the number of Employees");
        int employees = scanner2.nextInt();

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for(int i=1;i<=employees;i++){
            System.out.println("--------Enter the Details of Employee"+i+"---------");
            System.out.println("Enter the name of Employee"+i+":");
            String employeeName1 = scanner.nextLine();
            System.out.println("Enter the age of Employee"+i+":");
            int employeeAge1 = scanner2.nextInt();
            System.out.println("Enter the mobileNo of Employee"+i+":");
            String employeeMobileNo1 = scanner.nextLine();
            System.out.println("Enter the address of Employee"+i+":");
            String employeeAddress1 = scanner.nextLine();
            System.out.println("Enter the plotNo of Employee"+i+":");
            int employeePlotNo1 = scanner2.nextInt();
            System.out.println("Enter the city of Employee"+i+":");
            String employeeCity1 = scanner.nextLine();
            System.out.println("Enter the state of Employee"+i+":");
            String employeeState1 = scanner.nextLine();
            System.out.println("Enter the pinCode of Employee"+i+":");
            int employeePinCode1 = scanner2.nextInt();
            System.out.println("Enter the accountNumber of Employee"+i+":");
        String employeeAccountNumber1 = scanner.nextLine();
        System.out.println("Enter the ifsc of Employee"+i+":");
        String employeeIfsc1 = scanner.nextLine();
        System.out.println("Enter the bankName of Employee"+i+":");
        String employeeBankName1 = scanner.nextLine();

        Employee employee = new Employee(employeeName1,employeeAge1,employeeMobileNo1,employeeAddress1,employeePlotNo1,employeeCity1,employeeState1,employeePinCode1,employeeAccountNumber1,employeeIfsc1,employeeBankName1);
        employeeArrayList.add(employee);
        }


        System.out.println("----------------------------------------------");
        System.out.println("Enter the number of Persons");
        int persons = scanner2.nextInt();

        ArrayList<Person> personArrayList = new ArrayList<>();
        for(int i=1;i<=persons;i++){
            System.out.println("--------Enter the Details of Person"+i+"---------");
            System.out.println("Enter the name of Person"+i+":");
            String personName1 = scanner.nextLine();
            System.out.println("Enter the age of Person"+i+":");
            int personAge1 = scanner2.nextInt();
            System.out.println("Enter the mobileNo of Person"+i+":");
            String personMobileNo1 = scanner.nextLine();
            System.out.println("Enter the address of Person"+i+":");
            String personAddress1 = scanner.nextLine();
            System.out.println("Enter the plotNo of Person"+i+":");
            int personPlotNo1 = scanner2.nextInt();
            System.out.println("Enter the city of Person"+i+":");
            String personCity1 = scanner.nextLine();
            System.out.println("Enter the state of Person"+i+":");
            String personState1 = scanner.nextLine();
            System.out.println("Enter the pinCode of Person"+i+":");
            int personPinCode1 = scanner2.nextInt();

            Person person = new Person(personName1,personAge1,personMobileNo1,personAddress1,personPlotNo1,personCity1,personState1,personPinCode1);
            personArrayList.add(person);
        }


        System.out.println("----------------------------------------------");
        System.out.println("----------Details of Clients---------");
        for(int i=0;i<clients;i++){
            System.out.println("--------------Details of Client"+(i+1)+"----------------");
        clientArrayList.get(i).getDetails();
        Company clientCompany1 = clientArrayList.get(i).getCompany();
        System.out.println("Company Name of Client1 is " +clientCompany1.getCompanyName());
        System.out.println("Company Address of Client1 is " +clientCompany1.getCompanyAddress());
        }


        System.out.println("----------------------------------------------");
        System.out.println("----------Details of Employees---------");
        for(int i=0;i<employees;i++){
            System.out.println("--------------Details of Employee"+(i+1)+"----------------");
            employeeArrayList.get(i).getDetails();
            BankAccount employeeBankAccount1 = employeeArrayList.get(i).getBankAccount();
            System.out.println("AccountNo: " +employeeBankAccount1.getAccountNumber());
        System.out.println("IFSC Code: " +employeeBankAccount1.getIfsc());
        System.out.println("BankName: " +employeeBankAccount1.getBankName());
        }


        System.out.println("----------------------------------------------");
        System.out.println("---------Details of Person-------");
        for(int i=0;i<persons;i++){
            System.out.println("--------------Details of Person"+(i+1)+"----------------");
            personArrayList.get(i).getDetails();
        }

    }
}