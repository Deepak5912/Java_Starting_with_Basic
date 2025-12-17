package three.Interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
//        ElectricCar ec = new ElectricCar();
//        ec.accelerate();
//        ec.turnleft();
//        ec.turnright();
//        ec.brreak();

        CarControls cc = new ElectricCar(); // upcasting
        cc.turnleft();
        cc.turnleft();
        cc.turnright();
        cc.brreak();


        CarControls car2 = new SportCar();
        car2.turnleft();
        car2.accelerate();
    }
}
