// Pen class representing the blueprint for Pen objects
class Pen {
    // Instance variables (Attributes)
    String color;
    String type;
    String brand;
    String write;

    // Default Constructor: Assigns default values when no arguments are passed
    Pen() {
        color = "Unknown";
        type = "Unknown";
        brand = "Unknown";
        write = "Unknown";
    }

    // Parameterized Constructor: Initializes fields with user-provided values
    Pen(String c, String t, String b, String w) {
        this.color = c;
        this.type = t;
        this.brand = b;
        this.write = w;
    }

    // Copy Constructor: Copies field values from an existing Pen object
    Pen(Pen other) {
        this.color = other.color;
        this.type = other.type;
        this.brand = other.brand;
        this.write = other.write;
    }

    // Method to display complete details of the pen
    public void printdetails() {
        System.out.println("Color:" + this.color);
        System.out.println("Type:" + this.type);
        System.out.println("Brand:" + this.brand);
        System.out.println("Write:" + this.write);
    }

    // Secondary display method
    public void display() {
        System.out.println("Color:" + this.color);
        System.out.println("Type:" + this.type);
        System.out.println("Brand:" + this.brand);
        System.out.println("Write:" + this.write);
    }
}

// Main class to execute the program
public class Java {
    public static void main(String args[]) {
        // 1. Creating object using Default Constructor
        Pen P1 = new Pen();

        // 2. Creating object using Parameterized Constructor
        Pen P2 = new Pen("Black", "Gel", "Parker", "Writing smoothly");

        // 3. Creating object using Copy Constructor (copies P2 into P3)
        Pen P3 = new Pen(P2);

        // Manually assigning values to P1's fields
        P1.color = "Blue";
        P1.type = "Ballpoint";
        P1.brand = "Reynolds";
        P1.write = "Writing smoothly";

        // Displaying details of all pen objects
        P1.printdetails();
        P2.printdetails();
        P3.printdetails();
    }
}
