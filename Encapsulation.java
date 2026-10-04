// Access Modifiers & Encapsulation Demonstration
class Account {
    // 1. PUBLIC: Accessible from anywhere
    public String accountType;

    // 2. PROTECTED: Accessible within the same package & subclasses
    protected String bankName;

    // 3. DEFAULT (Package-Private): Accessible within the same package
    String accountHolder;

    // 4. PRIVATE: Accessible ONLY inside this class (Data Hiding)
    private String password;

    // Getter & Setter for private variable with validation logic
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        if (pass != null && pass.length() >= 4) {
            this.password = pass;
        } else {
            System.out.println("Error: Password must be at least 4 characters long.");
        }
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        // Creating Object of Account class
        Account acc = new Account();

        // Assigning data using object reference
        acc.accountType = "Savings Account";
        acc.bankName = "State Bank of India";
        acc.accountHolder = "Fahad Jawed";
        acc.setPassword("ABCD123");

        // Printing details
        System.out.println("--- Account Details ---");
        System.out.println("Account Type (Public): " + acc.accountType);
        System.out.println("Bank Name (Protected): " + acc.bankName);
        System.out.println("Account Holder (Default): " + acc.accountHolder);
        System.out.println("Password (Private via Getter): " + acc.getPassword());
    }
}
