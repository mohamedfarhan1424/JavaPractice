package FileIO;

public interface PersonInterface {
    Address getAddress();

    void setAddress(Address address);

    String getName();

    void setName(String name);

    String getMobile();

    void setMobile(String mobile);

    int getAge();

    void setAge(int age);

    void setCompany(Company company);

    void setBankAccount(BankAccount bankAccount);

    String toString();
}
