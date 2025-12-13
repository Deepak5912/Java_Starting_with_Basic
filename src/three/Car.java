package three;

public class Car {
    String brand;
    String color;    // are called properties
    int Speed;
    int year;

    public Car(String brand, String color, int speed, int year) {
        this.brand = brand;
        this.color = color;
        Speed = speed;
        this.year = year;
    }

    //
//    public Car(String brand, String color, int Speed, int year) {
//        System.out.println("Car Constructor");
//        this.brand = brand;
//        this.color = color;
//        this.Speed = Speed;
//        this.year = year;
//    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(int speed) {

    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return Speed;
    }
    public void derive(){ // this is called behaiviour
        System.out.println(brand+" are in  "+ " " +color+" color , running on the speed at"+ " " +Speed);
    }
}
