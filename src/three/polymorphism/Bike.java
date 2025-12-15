package three.polymorphism;

public class Bike extends Vechicle {
//    int speed;
//    String brand;
    boolean has_carrier;




    public Bike(int speed,String brand, boolean has_carrier){
        super(speed,brand);
        this.has_carrier=false;
    }
    public void start(){
        System.out.println("Bike started");
    }
//    @Override
    public void display() {
        System.out.println(" Bike speed: "+ this.getSpeed() + "  and bike  brand are : --->>>    " + this.getBrand());
        //System.out.println("brand: "+this.brand);
    }
}
