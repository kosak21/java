import java.util.Objects;

class Wheel_4_lab {
    private String type;

    public Wheel_4_lab(String type){
        this.type=type;
    }

    public void change(){
        System.out.println("Колесо заменено");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false; Wheel_4_lab wheel_4_lab = (Wheel_4_lab) o;
        return Objects.equals(type, wheel_4_lab.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}

class Engine {
    private String model;

    public Engine(String model) {
        this.model = model;
    }

    public void refuel() {
        System.out.println("Двигатель заправлен.");
    }

    @Override
    public String toString() {
        return "Engine{" + "model='" + model + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null|| getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode(){
        return Objects.hash(model);
    }
}

class Car{
    private String brand;
    private Engine engine;
    private Wheel_4_lab wheel_4_lab;

    public Car(String brand, Engine engine, Wheel_4_lab wheel_4_lab){
        this.brand=brand;
        this.engine=engine;
        this.wheel_4_lab=wheel_4_lab;
    }

    public void drive(){
        System.out.println("Автомобиль едет");
    }

    public void refuel(){
        engine.refuel();
    }

    public void changeWheel(){
        wheel_4_lab.change();
    }

    public void printBrand(){
        System.out.println("Марка автомобиля: " + brand);
    }

    @Override
    public String toString(){
        return "Car{" + "brand='" + brand + '\'' + ", engine=" + engine + ", wheel=" + wheel_4_lab + '}';
    }

    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand)&& Objects.equals(engine, car.engine)&& Objects.equals(wheel_4_lab, car.wheel_4_lab);
    }

    @Override
    public int hashCode(){
        return Objects.hash(brand, engine, wheel_4_lab);
    }
}

public class Wheel_4 {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Wheel_4_lab wheel_4_lab = new Wheel_4_lab("Зимнее");
        Car car = new Car("BMW", engine, wheel_4_lab);

        car.printBrand();
        car.drive();
        car.refuel();
        car.changeWheel();
    }
}