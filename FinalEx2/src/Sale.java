public class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double totalExpense = getServiceExpense() + getProductExpense();
        double discountRate = 0.0;

        if (serviceExpense > 0) {
            discountRate = customer.getServiceMemberDiscount();
        } else if (productExpense > 0) {
            discountRate = customer.getProductMemberDiscount();
        }

        return totalExpense - (totalExpense * discountRate);
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Date: " + getDate());
        System.out.println("Service Expense: " + getServiceExpense());
        System.out.println("Product Expense: " + getProductExpense());
        System.out.println("Total Expense: " + getTotalExpense());
        System.out.println("\n");
    }
}


