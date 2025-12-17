package three.Interfaces;

public class ElectricCar implements CarControls{

    @Override
    public void accelerate() {
        System.out.println("Accelerating electric car...");
    }

    @Override
    public void turnleft() {
        System.out.println("Turning left...");

    }

    @Override
    public void turnright() {
        System.out.println("Turning right...");

    }

    @Override
    public void brreak() {
        System.out.println("APPLY BRAKES...");

    }
}
