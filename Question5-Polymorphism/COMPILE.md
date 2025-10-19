# Compilation and Setup Instructions

## Java Development Kit (JDK) Required
To compile and run this project, you need the Java Development Kit (JDK) installed on your system.

### Current System Status
- Java Runtime Environment (JRE) is available: Java 1.8.0_461
- Java Development Kit (JDK) with `javac` compiler is not currently installed

### Installing JDK on macOS
1. **Install Oracle JDK:**
   - Visit: https://www.oracle.com/java/technologies/downloads/
   - Download JDK for macOS
   - Install the downloaded package

2. **Install OpenJDK using Homebrew:**
   ```bash
   brew install openjdk
   ```

3. **Install using SDKMAN:**
   ```bash
   curl -s "https://get.sdkman.io" | bash
   sdk install java
   ```

### Compilation Commands (once JDK is installed)
```bash
# Compile all Java files
javac src/*.java

# Run the main application
java -cp src Main
```

### Expected Program Output
```
=== Car Loan Management System ===
Demonstrating Polymorphism and Inheritance

Car Loan #1:
Loan ID: CL001
Customer Name: John Smith
Loan Type: Car Loan
Loan Amount: $25000.00
Car Lien: $22000.00

Car Loan #2:
Loan ID: CL002
Customer Name: Sarah Johnson
Loan Type: Car Loan
Loan Amount: $35000.00
Car Lien: $30000.00

Car Loan #3:
Loan ID: CL003
Customer Name: Michael Brown
Loan Type: Car Loan
Loan Amount: $18000.00
Car Lien: $15000.00

=== Demonstrating Polymorphism ===
Loan 1 - Type: Car Loan, Amount: $25000.00
Loan 2 - Type: Car Loan, Amount: $35000.00
Loan 3 - Type: Car Loan, Amount: $18000.00

=== Summary ===
Total Loan Amount: $78000.00
Total Car Liens: $67000.00
Total Equity: $11000.00
```

## Code Verification
The Java code has been reviewed for:
- ✅ Correct syntax and structure
- ✅ Proper inheritance implementation
- ✅ Abstract class usage
- ✅ Polymorphism demonstration
- ✅ Object-oriented principles adherence

All code follows Java best practices and should compile without errors once a JDK is installed.