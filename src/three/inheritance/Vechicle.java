package three.inheritance;

public class Vechicle {
    private int speed;
    private String FuelType;
    private String brand;



    public Vechicle(int speed, String fuelType, String brand) {
        this.speed = speed;
        FuelType = fuelType;
        this.brand = brand;

    }
        public void setSpeed ( int speed){
            this.speed = speed;
        }

        public int getSpeed () {
            return speed;
        }

        public void setFuelType (String fuelType){
            FuelType = fuelType;
        }

        public String getFuelType () {
            return FuelType;
        }

        public void setbrnd (String brand){
            this.brand = brand;
        }

        public String getBrand () {
            return brand;
        }


        public void display() {
            //String speed;
            System.out.println("speed:" + this.speed + "fuel type" + FuelType + "brand" + brand);
            //System.out.println(Engine_Start());
        }
    }

