package com.vtalent.chaithanya.InnerClass;

 class Car {
    String carName;
    String carType;
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }
    private String getCarName() {
        return this.carName;
    }
    class Engine {
        String engineType;
        void setEngine() {
// Accessing carType property of Car
            if(Car.this.carType.equals("4WD")){
// Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Bigger";
                } else {
                    this.engineType = "Smaller";
                }
            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}
public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "8WD");
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }
}
