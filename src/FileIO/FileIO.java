package FileIO;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileIO {
    public static void main(String[] args) {
        try{
            String[] files = {"Person.txt","Employee.txt","Client.txt"};

            String[] classes = {"Person","Employee","Client"};

            BufferedWriter clear = new BufferedWriter(new FileWriter("output.txt"));
            clear.write("");
            clear.close();

            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt",true));

            for(int i=0;i<files.length;i++){
                BufferedReader file = new BufferedReader(new FileReader(files[i]));
                ArrayList<String> details = new ArrayList<>();
                String line;
                while ((line = file.readLine())!= null) {
                    String[] value = line.split(" ");
                    details.add(value[1]);
                }
                file.close();

                PersonInterface obj =  null;

                if(classes[i].equals("Person")){
                    obj = new Person();

                }
                else if(classes[i].equals("Employee")){
                    obj = new Employee();



                    BankAccount bankAccount = new BankAccount();
                    bankAccount.setAccountNumber(details.get(7));
                    bankAccount.setIfsc(details.get(8));
                    bankAccount.setBankName(details.get(9));
                    obj.setBankAccount(bankAccount);




                }
                else{
                   obj = new Client();



                    Company company = new Company();
                    company.setcName(details.get(7));
                    company.setcAddress(details.get(8));
                    obj.setCompany(company);


                }

                obj.setName(details.get(0));
                obj.setMobile(details.get(1));
                obj.setAge(Integer.parseInt(details.get(2)));
                Address address = new Address();
                address.setPlotNo(Integer.parseInt(details.get(3)));
                address.setCity(details.get(4));
                address.setState(details.get(5));
                address.setPincode(Integer.parseInt(details.get(6)));
                obj.setAddress(address);

                output.write("DETAILS OF "+classes[i]+"\n");
                output.write(obj.toString());

                output.write("\n--------------------\n");

            }

            output.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
