package three;

import java.util.Date;

public class classesObjectdemo {
    public static void main(String[] args) {
        Car car = new Car("Maruti", "red", 120, 2025);  // instiaance :- creation of object of any claas
//        car.color = "red";
//        car.year = 2020;
//        car.Speed = 180;
//        car.brand = "audi";
        car.derive();

        Car car2 = new Car("audi", "mehroom", 230, 2032);
//        car2.color = "White";
//        car2.year = 2025;
//        car2.Speed = 200;
//        car2.brand = "Siera";
        car2.derive();

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());
    }
}
