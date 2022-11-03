package OOPsTask;

class Company{
    private String companyName;
    private String companyAddress;



    public Company(String companyName,String companyAddress){
        setCompanyName(companyName);
        setCompanyAddress(companyAddress);
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyAddress() {
        return companyAddress;
    }
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }




}

public class Client extends Person{
    private Company company;

    public Client(String name,int age,String mobileNo,String address,int plotNo,String city,String state,int pinCode,String companyName,String companyAddress){
        super(name,age,mobileNo,address,plotNo,city,state,pinCode);

        setCompany(companyName,companyAddress);
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(String companyName,String companyAddress){
        this.company = new Company(companyName,companyAddress);
    }
}
