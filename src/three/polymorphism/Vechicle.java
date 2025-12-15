package three.polymorphism;

public class Vechicle {

    private int speed;
    private String brand;



    public  Vechicle(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public void startingEngine() {
        System.out.println("Vechincle Starting");
    }


    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void display() {
        //String speed;
        System.out.println(" Vechile are running at the speed  :   " + this.speed + " and theire brand are :  >>  " + this.brand );
        //System.out.println(Engine_Start());
    }

    //public abstract void start();
}