package structural;

interface Car {
    void assemble();
}

class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("v4 engine assembled, 16 inch tyres assembled");
    }
}

class CarDecorator implements Car {
    Car car;
    CarDecorator(Car car) {
        this.car = car;
    }
    @Override
    public void assemble() {
        car.assemble();
    }
}

class SportsCar extends CarDecorator {
    SportsCar(Car car) {
        super(car);
    }

    public void assemble() {
        car.assemble();
        System.out.println("v4 engine upgraded to v8");
    }
}
public class Decorator {
    public static void main(String[] args) {
        Car car = new BasicCar();
        //car.assemble();

        CarDecorator sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

    }
}
