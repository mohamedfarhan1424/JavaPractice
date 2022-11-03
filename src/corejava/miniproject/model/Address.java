package corejava.miniproject.model;

public class Address{
    private String plotno;
    private String street;
    private String city;
    private String state;

    public Address(String plotno, String street, String city, String state) {
        this.plotno = plotno;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getPlotno() {
        return plotno;
    }

    public void setPlotno(String plotno) {
        this.plotno = plotno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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


    @Override
    public String toString() {
        return "{" +"\n"+
                "\t\t\tplotno: " + plotno + "\n"+
                "\t\t\tstreet: " + street + "\n"+
                "\t\t\tcity: " + city + "\n"+
                "\t\t\tstate: " + state + "\n"+
                "\t\t}";
    }
}