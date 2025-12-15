package three.polymorphism;

public class Car extends Vechicle {
    private int doors;

    public Car(int speed, String brand, int doors) {
        super(speed, brand);
        this.doors = doors;
//        this.doors = doors;
    }
     public void start() {
        System.out.println("Starting car");

    }











    public void display() {
        System.out.println(" Car at  speed: "+ this.getSpeed() + "  and Car's doors are : --->>>   " + this.doors +"  brand are : --->>>    " + this.getBrand());
        //System.out.println("brand: "+this.brand);
    }
}
