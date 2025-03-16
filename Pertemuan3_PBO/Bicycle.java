public class Bicycle {
    int Speed = 1;
    int Gear = 1;

    void ChangeSpeed(int newValue) {
        Speed += newValue;
        System.out.println("Speed : " + Speed);
    }

    void ChangeGear(int newValue) {
        Gear += newValue;
        System.out.println("Gear : " + Gear);
    }
    
}