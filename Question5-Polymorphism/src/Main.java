/**
 * Main application to demonstrate Object-Oriented Programming concepts
 * with Loan and CarLoan classes, showcasing polymorphism and inheritance
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Car Loan Management System ===");
        System.out.println("Demonstrating Polymorphism and Inheritance\n");
        
        // Create car loan objects
        CarLoan carLoan1 = new CarLoan();
        CarLoan carLoan2 = new CarLoan();
        CarLoan carLoan3 = new CarLoan();
        
        // Assign values to their id, type, amount and name for first car loan
        carLoan1.setLoanId("CL001");
        carLoan1.setCustName("John Smith");
        carLoan1.setAmount(25000.00);
        carLoan1.setCarLien(22000.00);
        
        // Assign values for second car loan
        carLoan2.setLoanId("CL002");
        carLoan2.setCustName("Sarah Johnson");
        carLoan2.setAmount(35000.00);
        carLoan2.setCarLien(30000.00);
        
        // Assign values for third car loan
        carLoan3.setLoanId("CL003");
        carLoan3.setCustName("Michael Brown");
        carLoan3.setAmount(18000.00);
        carLoan3.setCarLien(15000.00);
        
        // Display all the values using polymorphism
        System.out.println("Car Loan #1:");
        System.out.println(carLoan1.displayLoanInfo());
        System.out.println();
        
        System.out.println("Car Loan #2:");
        System.out.println(carLoan2.displayLoanInfo());
        System.out.println();
        
        System.out.println("Car Loan #3:");
        System.out.println(carLoan3.displayLoanInfo());
        System.out.println();
        
        // Demonstrate polymorphism - using parent class reference
        System.out.println("=== Demonstrating Polymorphism ===");
        Loan[] loans = {carLoan1, carLoan2, carLoan3};
        
        for (int i = 0; i < loans.length; i++) {
            System.out.printf("Loan %d - Type: %s, Amount: $%.2f%n", 
                            i + 1, loans[i].getLoanType(), loans[i].getAmount());
        }
        
        System.out.println("\n=== Summary ===");
        double totalAmount = 0;
        double totalLien = 0;
        
        for (int i = 0; i < 3; i++) {
            CarLoan loan = (i == 0) ? carLoan1 : (i == 1) ? carLoan2 : carLoan3;
            totalAmount += loan.getAmount();
            totalLien += loan.getCarLien();
        }
        
        System.out.printf("Total Loan Amount: $%.2f%n", totalAmount);
        System.out.printf("Total Car Liens: $%.2f%n", totalLien);
        System.out.printf("Total Equity: $%.2f%n", totalAmount - totalLien);
    }
}
