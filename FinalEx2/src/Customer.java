public class Customer implements DiscountRate {
private String customerName;
private String customerType;
Customer(String customerName, String customerType){
    this.customerName = customerName;
    this.customerType = customerType;
}

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public double getServiceMemberDiscount() {
        switch (customerType) {
            case "Premium":
                return 0.2;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.1;
            default:
                return 0.0;
        }
    }

    @Override
    public double getProductMemberDiscount() {
        switch (customerType) {
            case "Premium":
            case "Gold":
                return 0.1;
            default:
                return 0.0;
        }
    }
}

