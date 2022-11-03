package FileIO;

class Company{
    private String cName;
    private String cAddress;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String toString() {
        return "\n Name: " + cName + "\n Address: " + cAddress;
    }
}

public class Client extends Person{
    private Company company;

    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    public String toString() {
        return "Name: "+getName()+"\nMobile: "+getMobile()+"\nAge: "+getAge()+"\nAddress "+getAddress().toString() + "\nCompany Details "+company.toString();
    }
}
