package BK;

public class Customer {
private String customerId;
    private String customerName;
    private String nationalId;
    private String phoneNumber;

    public Customer(String customerId, String customerName, String nationalId, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.nationalId = nationalId;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() { return customerName; }

    @Override
    public String toString() {
        return "Customer [ID=" + customerId + ", Name=" + customerName + ", NID=" + nationalId + ", Phone=" + phoneNumber + "]";
    }
}

