package corejava.miniproject.model;



public class User {

    private int id;
    private String name;
    private String email;
    private String mobile;
    private Address address;

    public int getId() {
        return id;
    }

    public User(int id, String name, String email, String mobile, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return  "\n"+"{" + "\n"+
                "   id: " + id +"\n"+
                "   name: " + name + "\n"+
                "   email: " + email + "\n"+
                "   address: " + address.toString() +"\n"+
                "   mobile: " + mobile + "\n"+
                "}";
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
