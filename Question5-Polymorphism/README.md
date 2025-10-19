# Question 5: Object-Oriented Programming Concepts

## Project Overview
This project demonstrates key Object-Oriented Programming concepts including **Polymorphism** and **Interface** through a Java loan management system.

## Object-Oriented Concepts Explained

### a) Polymorphism
**Polymorphism** means "many forms" and allows objects of different classes to be treated as objects of a common base class. The same method call can behave differently depending on the object type.

**Example from our code:**
```java
// Using parent class reference to hold child objects
Loan[] loans = {carLoan1, carLoan2, carLoan3};

for (int i = 0; i < loans.length; i++) {
    // Same method call, but behavior depends on actual object type
    System.out.println(loans[i].getLoanType()); // Calls CarLoan's implementation
}
```

**Real-world example:**
```java
// Different animals make different sounds
Animal[] animals = {new Dog(), new Cat(), new Bird()};
for (Animal animal : animals) {
    animal.makeSound(); // Dog barks, Cat meows, Bird chirps
}
```

### Interface
An **Interface** is a contract that defines what methods a class must implement, without providing the implementation details. It ensures consistent behavior across different classes.

**Example Interface:**
```java
interface Drawable {
    void draw();        // Method signature only
    void setColor(String color);
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    public void setColor(String color) {
        System.out.println("Circle color: " + color);
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    public void setColor(String color) {
        System.out.println("Rectangle color: " + color);
    }
}
```

**Benefits of Interfaces:**
- Ensures multiple classes follow the same contract
- Supports multiple inheritance (a class can implement multiple interfaces)
- Promotes loose coupling and code flexibility

## Project Structure
```
Question5-Polymorphism/
├── src/
│   ├── Loan.java       # Abstract parent class
│   ├── CarLoan.java    # Concrete child class
│   └── Main.java       # Main application
└── README.md           # This file
```

## Classes Description

### Loan.java (Abstract Class)
- **Data Members**: loan_id, loan_type, amount, customer_name
- **Constructor**: No-arg constructor initializing amount to 0
- **Methods**: Setters and getters for loan_id, customer_name, and amount
- **Abstract Method**: `getLoanType()` - must be implemented by subclasses

### CarLoan.java (Concrete Class)
- **Inheritance**: Extends Loan class
- **Additional Member**: car_lien (lien on the car)
- **Constructor**: No-arg constructor calling parent constructor
- **Methods**: Setters/getters for car_lien, implements getLoanType()
- **Polymorphism**: Overrides abstract method from parent class

### Main.java (Application)
- Creates multiple CarLoan objects
- Assigns values to loan properties
- Demonstrates polymorphism using parent class references
- Displays comprehensive loan information

## How to Compile and Run

1. **Compile the Java files:**
   ```bash
   javac src/*.java
   ```

2. **Run the main application:**
   ```bash
   java -cp src Main
   ```

## Expected Output
The program displays:
- Individual car loan details
- Polymorphic behavior demonstration
- Summary with totals and calculations

## Key Learning Points
1. **Abstraction**: Loan class defines common structure without complete implementation
2. **Inheritance**: CarLoan inherits and extends Loan functionality
3. **Polymorphism**: Same method calls produce different behaviors
4. **Encapsulation**: Private data members with public accessor methods

## Assignment Requirements Fulfilled
- ✅ Abstract class 'Loan' with specified data members and methods
- ✅ CarLoan class inheriting from Loan with car_lien variable
- ✅ Main application creating objects and displaying values
- ✅ Explanation of Polymorphism and Interface concepts
- ✅ Code saved in GitHub repository: Question5-Polymorphism