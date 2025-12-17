package three.Interfaces;

public class SportCar implements CarControls {

    @Override
    public void accelerate() {
        System.out.println("Sport car accelerating...");
    }

    @Override
    public void turnleft() {
        System.out.println("Sport car turning left...");

    }

    @Override
    public void turnright() {
        System.out.println("Sport car turning right...");

    }

    @Override
    public void brreak() {
        System.out.println("Sport car breaking...");

    }
}
