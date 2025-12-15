package three.inheritance;

public class Bike extends Vechicle{
    int numofwheels ;

    public Bike(int speed, String fuelType, String brand, int numofwheels) {
        super(speed, fuelType, brand);
        this.numofwheels=numofwheels;
    }
}

