package three.encapsulation;


class Car {
    private String brand;
    private String color;    // are called properties
    private int Speed;
    private int year;

    public Car(String brand, String color, int speed, int year) {
        this.brand = brand;
        this.color = color;
        Speed = speed;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return Speed;
    }

   public void setSpeed(int speed) {
        if(speed < 0)
            Speed = 0;
        this.Speed = speed;
       //Speed = speed;
   }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void derive(){ // this is called behaiviour
        System.out.println(brand+" are in  "+ " " +color+" color , running on the speed at"+ " " +Speed);
    }}

public class Encapsulation {
        public static void main(String[] args) {
            Car car3 = new Car("toyaota", "red", 202, 2000);
            car3.derive();
            car3.setBrand("bmw");
            car3.setColor("black");
            car3.setSpeed(-800);
            car3.setYear(2001);
            car3.derive();

            Car car4 = new Car("farari", "blue", 192, 2005);
            car4.derive();

        }
}

