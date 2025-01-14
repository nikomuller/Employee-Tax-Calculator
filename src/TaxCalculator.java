import java.util.Scanner;

public class TaxCalculator {
    static final double ALLOWANCE_SINGLE = 20000;
    static final double ALLOWANCE_MARRIED = 25000;
    static final double TAX_RATE_SINGLE = 0.2;
    static final double TAX_RATE_MARRIED = 0.23;
    static final double MINIMUM_GROSS_PAY = 35000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your employee ID: ");
        String employeeId = sc.nextLine();

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.print("Please enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter marital status (s for single, m for married): ");
        char maritalStatus = sc.next().charAt(0);

        System.out.print("Enter your gross pay: ");
        double grossPay = sc.nextDouble();
        sc.nextLine();

        double allowance = 0;
        double taxRate = 0;
        if (maritalStatus == 's') {
            allowance = ALLOWANCE_SINGLE;
            taxRate = TAX_RATE_SINGLE;
        } else if (maritalStatus == 'm') {
            allowance = ALLOWANCE_MARRIED;
            taxRate = TAX_RATE_MARRIED;
        }

        double taxableIncome = grossPay - allowance;
        taxableIncome = Math.max(taxableIncome, MINIMUM_GROSS_PAY - allowance);
        double tax = taxableIncome * taxRate;
        double netPay = grossPay - tax;

        System.out.println("\nEmployee Details:");
        System.out.println("-----------------");
        System.out.printf("ID: %s\n", employeeId);
        System.out.printf("Name: %s\n", name);
        System.out.printf("Address: %s\n", address);
        System.out.printf("Marital Status: %s\n", maritalStatus == 's' ? "Single" : "Married");
        System.out.printf("Gross Pay: €%.2f\n", grossPay);
        System.out.printf("Net Pay: €%.2f\n", netPay);
        System.out.printf("Tax Paid: €%.2f\n", tax);
        System.out.printf("For a gross pay of €" + grossPay + ", your total tax is €" + tax + " and your netpay is €" + netPay + "");
        System.out.printf("\n------------------------");
        System.out.printf("\nSecurity Feature");
        System.out.printf("\n------------------------");
        System.out.print("\nEnter password: ");
        String password1 = sc.nextLine();

        System.out.print("Enter password again: ");
        String password2 = sc.nextLine();

        if (!password1.equals(password2)) {
            System.out.println("\nError: Passwords do not match");
        } else {
            // store the password
        }
    }
}