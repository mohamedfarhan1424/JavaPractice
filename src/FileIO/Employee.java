package FileIO;

class BankAccount{

    private String accountNumber;
    private String ifsc;
    private String bankName;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String toString() {
        return "\n Account Number: " + accountNumber + "\n Ifsc: " + ifsc + "\n Bank Name: " + bankName;
    }
}

public class Employee extends Person {


    private BankAccount bankAccount;


    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String toString() {
        return "Name: "+getName()+"\nMobile: "+getMobile()+"\nAge: "+getAge()+"\nAddress "+getAddress().toString() + "\nBank Account "+bankAccount.toString();
    }
}
