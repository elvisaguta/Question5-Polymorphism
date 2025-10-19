/**
 * CarLoan class that extends the abstract Loan class
 * Demonstrates inheritance and polymorphism concepts
 */
public class CarLoan extends Loan {
    // Variable for lien placed on the car until loan is reimbursed
    private double car_lien;
    
    /**
     * No-arg constructor that initializes the variables amount, loan_id and cust_name
     * Calls the parent constructor to initialize amount to 0
     */
    public CarLoan() {
        super(); // Initialize amount to 0 from parent class
        this.car_lien = 0.0;
    }
    
    /**
     * Method to assign value to the lien
     * @param lien the lien amount to set
     */
    public void setCarLien(double lien) {
        this.car_lien = lien;
    }
    
    /**
     * Method to return the value of the lien
     * @return the car lien amount
     */
    public double getCarLien() {
        return car_lien;
    }
    
    /**
     * Implementation of the abstract method from parent class
     * @return the loan type as "Car Loan"
     */
    @Override
    public String getLoanType() {
        return "Car Loan";
    }
    
    /**
     * Method to display all car loan information
     * @return formatted string with all loan details
     */
    public String displayLoanInfo() {
        return String.format(
            "Loan ID: %s\nCustomer Name: %s\nLoan Type: %s\nLoan Amount: $%.2f\nCar Lien: $%.2f",
            getLoanId(), getCustName(), getLoanType(), getAmount(), getCarLien()
        );
    }
}