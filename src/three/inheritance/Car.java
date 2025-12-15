package three.inheritance;

public class Car extends  Vechicle{
    public  int numofdoor ;


    public Car(int speed, String fuelType, String brand, int numofdoor) {
        super(speed, fuelType, brand);
        this.numofdoor = numofdoor;
    }



}

