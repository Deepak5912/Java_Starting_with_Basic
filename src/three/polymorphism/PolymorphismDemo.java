package three.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Car car = new Car(120,"BMW", 4);
        car.display();
        System.out.println();
        car.start();
        System.out.println("\n");
        System.out.println( );

        Bike bike = new Bike(100, "Hero honda ", false);
        bike.start();
        System.out.println( );
        bike.display();

        Vechicle v1 = new Vechicle(99, "Audi");
        v1.startingEngine();
        System.out.println();
        v1.display();

        }
    }

