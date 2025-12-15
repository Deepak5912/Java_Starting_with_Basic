package three.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c1 = new Car(120, "Petrol", "Audi", 5 );
        //c1.numofdoor = 4;
//        c1.brand = "BMW";
//        c1.FuelType = "Diesel";
//        System.out.println();
        c1.display();

        Bike b1 = new Bike(100,"Electric","Honda",2);
        //b1.numofwheels=4;
//        b1.brand="Yamaha";
//        b1.FuelType="Gasoline";
//        System.out.println();
        b1.display();
    }
}
