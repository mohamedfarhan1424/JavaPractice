package OOPsTask;

class Person{
    private String name;
    private int age;
    private String mobileNo;
    private String address;
    private int plotNo;
    private String city;
    private String state;
    private int pinCode;

    public Person(String name, int age, String mobileNo, String address, int plotNo,String city,String state,int pinCode){
        setName(name);
        setAge(age);
        setMobileNo(mobileNo);
        setAddress(address);
        setPlotNo(plotNo);
        setCity(city);
        setState(state);
        setPinCode(pinCode);
    }

    public void getDetails(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Mobile No: " + getMobileNo());
        System.out.println("Address: " + getAddress());
        System.out.println("Plot No: " + getPlotNo());
        System.out.println("City: " + getCity());
        System.out.println("State: " + getState());
        System.out.println("Pin Code: " + getPinCode());


    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public void setPlotNo(int plotNo){
        this.plotNo = plotNo;
    }
    public int getPlotNo(){
        return this.plotNo;
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



}