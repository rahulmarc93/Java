package oop;

class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }
        
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        double taxAmount = 0;

        if (empSal > 100000) {
            taxAmount = empSal * 0.08;
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 0.06;
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 0.05;
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 0.04;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
        
        return taxAmount;
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        // Test Case 1
        try {
            System.out.println("Tax amount is: " + taxCalculator.calculateTax("Ron", false, 34000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Test Case 2
        try {
            System.out.println("Tax amount is: " + taxCalculator.calculateTax("Tim", true, 1000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Test Case 3
        try {
            System.out.println("Tax amount is: " + taxCalculator.calculateTax("Jack", true, 55000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Test Case 4
        try {
            System.out.println("Tax amount is: " + taxCalculator.calculateTax("", true, 30000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
