/**
 * Abstract class representing a Loan with basic loan information
 * Demonstrates Object-Oriented concepts including abstraction and inheritance
 */
public abstract class Loan {
    // Data members
    private String loan_id;
    private String loan_type;
    private double amount;
    private String customer_name;
    
    /**
     * Default no-arg constructor that initializes loan amount to 0
     */
    public Loan() {
        this.amount = 0.0;
    }
    
    /**
     * Set method for loan_id
     * @param loan_id the loan ID to set
     */
    public void setLoanId(String loan_id) {
        this.loan_id = loan_id;
    }
    
    /**
     * Set method for customer name
     * @param cust_name the customer name to set
     */
    public void setCustName(String cust_name) {
        this.customer_name = cust_name;
    }
    
    /**
     * Get method for loan_id
     * @return the loan ID
     */
    public String getLoanId() {
        return loan_id;
    }
    
    /**
     * Get method for customer name
     * @return the customer name
     */
    public String getCustName() {
        return customer_name;
    }
    
    /**
     * Method to set the value of the loan amount
     * @param amount the loan amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    /**
     * Method to return the value of the loan amount
     * @return the loan amount
     */
    public double getAmount() {
        return amount;
    }
    
    /**
     * Abstract method to indicate the loan type
     * Must be implemented by concrete subclasses
     * @return the loan type as a string
     */
    public abstract String getLoanType();
}