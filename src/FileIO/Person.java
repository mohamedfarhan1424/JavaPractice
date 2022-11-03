package FileIO;


class Address {
    private int plotNo;
    private String city;
    private String state;
    private int pincode;

    public int getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(int plotNo) {
        this.plotNo = plotNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String toString(){
        return "\n PlotNo: " + plotNo + "\n State: " + state + "\n Pincode: " + pincode;
    }
}

public class Person implements PersonInterface {
    private String name;
    private String mobile;
    private int age;

    private Address address;


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(Company company){}

    public void setBankAccount(BankAccount bankAccount){}


    public String toString(){
        return "Name: "+getName()+"\nMobile: "+getMobile()+"\nAge: "+getAge()+"\nAddress "+address.toString();
    }

}
