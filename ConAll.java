class Pen{
    String color;
    String type;
    String brand;
    String write;

    public void printdetails(){
        System.out.println("Color:" + this.color);
        System.out.println("Type:" + this.type);
        System.out.println("Brand:" + this.brand);
        System.out.println("Write:" + this.write);
    }

    Pen(Pen other){
        this.color = other.color;
        this.type = other.type;
        this.brand = other.brand;
        this.write = other.write;
    }
     public void display(){
        System.out.println("Color:" + this.color);
        System.out.println("Type:" + this.type);
        System.out.println("Brand:" + this.brand);
        System.out.println("Write:" + this.write);
        }

    Pen(String c, String t, String b , String w ){
        this.color = c;
        this.type = t;
        this.brand = b;
        this.write = w;
    }
   
    Pen(){
        color ="Unknown";
        type = "Unknown";
        brand = "Unknown";
        write = "Unknown";
    }
}

public class Java {
    public static void main(String args[]){
        Pen P1 = new Pen();
        Pen P2 = new Pen("Black", "Gel", "Parker", "Writing smoothly");
        Pen P3 = new Pen(P2);
    
        P1.color = "Blue";
        P1.type = "Ballpoint";
        P1.brand = "Reynolds";
        P1.write = "Writing somoothly";
        
        

        P1.printdetails();
        P2.printdetails();
        P3.printdetails();
     }
}