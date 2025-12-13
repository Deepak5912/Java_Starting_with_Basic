package three;


record Bike(String color, int speed, String brand) {}

public class RecordDemo {
    public static void main(String[] args) {
        Bike b = new Bike("BMW",1000,"BMW");
        System.out.println("Brande " + b.brand());
        System.out.println("Color " + b.color());
        System.out.println("Speed " + b.speed());
        System.out.println(b);
    }
}

