// Parent class representing the blueprint for all animals
class Animal {
    String name;
    String food;
    String walk;
    String color;
    String drinking;

    // Common method to display animal details
    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Food: " + this.food);
        System.out.println("Walk: " + this.walk);
        System.out.println("Color: " + this.color);
        System.out.println("Drinking: " + this.drinking);
        System.out.println("------------------------------");
    }
}

// Hierarchical Inheritance: All animals extend Animal directly
class Dog extends Animal {}

class Snake extends Animal {}

class Lion extends Animal {}

class Tiger extends Animal {}

public class Main {
    public static void main(String[] args) {
        // Object creation
        Dog d1 = new Dog();
        Snake s1 = new Snake();
        Lion l1 = new Lion();
        Tiger t1 = new Tiger();

        // Initializing Dog properties
        d1.name = "Dog";
        d1.food = "Non Veg";
        d1.walk = "Yes";
        d1.color = "Black";
        d1.drinking = "Water";

        // Initializing Snake properties
        s1.name = "Snake";
        s1.food = "Non Veg";
        s1.walk = "No";
        s1.color = "Black & White";
        s1.drinking = "Water";

        // Initializing Lion properties
        l1.name = "Lion";
        l1.food = "Non Veg";
        l1.walk = "Yes";
        l1.color = "Orange";
        l1.drinking = "Water";

        // Initializing Tiger properties
        t1.name = "Tiger";
        t1.food = "Non Veg";
        t1.walk = "Yes";
        t1.color = "Orange & Black Stripes";
        t1.drinking = "Water";

        // Displaying details for all animals
        d1.printDetails();
        s1.printDetails();
        l1.printDetails();
        t1.printDetails();
    }
}
