package creational.builder;

public class CustomerBuilder implements ICustomerBuilder{
    private String firstName;
    private String middleName;
    private String lastName;
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryMobileNumber;
    private String secondaryMobileNumber;

    @Override
    public ICustomerBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public ICustomerBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public ICustomerBuilder middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Override
    public ICustomerBuilder primaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    @Override
    public ICustomerBuilder secondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
        return this;
    }

    @Override
    public ICustomerBuilder primaryMobileNumber(String primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
        return this;
    }

    @Override
    public ICustomerBuilder secondaryMobileNumber(String secondaryMobileNumber) {
        this.secondaryMobileNumber = secondaryMobileNumber;
        return this;
    }

    public Customer build() {
        return new Customer(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public String getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }
}
