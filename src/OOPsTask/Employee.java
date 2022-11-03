package OOPsTask;

class BankAccount{
    private String accountNumber;
    private String ifsc;
    private String bankName;

    public BankAccount(String accountNumber, String ifsc, String bankName){
        setAccountNumber(accountNumber);
        setIfsc(ifsc);
        setBankName(bankName);
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getIfsc(){
        return ifsc;
    }
    public void setIfsc(String ifsc){
        this.ifsc = ifsc;
    }
    public String getBankName(){
        return bankName;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;

    }
}
public class Employee extends Person{


    private BankAccount bankAccount;

    public Employee(String name,int age,String mobileNo,String address,int plotNo,String city,String state,int pinCode,String accountNumber, String ifsc, String bankName){
        super(name,age,mobileNo,address,plotNo,city,state,pinCode);
       setBankAccount(accountNumber,ifsc,bankName);

    }

    public BankAccount getBankAccount(){
        return this.bankAccount;
    }

    public void setBankAccount(String accountNumber, String ifsc, String bankName){
        this.bankAccount = new BankAccount(accountNumber,ifsc,bankName);
    }




}
