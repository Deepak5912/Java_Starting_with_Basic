package three;

public class Car {
    String brand;
    String color;    // are called properties
    int Speed;
    int year;

    public Car(String brand, String color, int Speed, int year) {
        System.out.println("Car Constructor");
        this.brand = brand;
        this.color = color;
        this.Speed = Speed;
        this.year = year;
    }

    public void derive(){ // this is called behaiviour
        System.out.println(brand+" are in  "+ " " +color+" color , running on the speed at"+ " " +Speed);
    }
}
