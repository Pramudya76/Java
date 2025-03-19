import transportasi.bicycle;
import transportasi.car;

public class TransportasiDemo {
    public static void main(String[] args) {
        bicycle Bicycle = new bicycle();
        car Car = new car();

        Bicycle.ChangeGear(2);
        Bicycle.ChangeSpeed(10);
        Car.maju();
        Car.mundur();
        Car.belok();


    }
}
