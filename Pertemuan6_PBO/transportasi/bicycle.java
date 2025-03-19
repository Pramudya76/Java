package transportasi;

public class bicycle {
    int Speed = 1;
    int Gear = 1;

    public void ChangeSpeed(int newValue) {
        Speed += newValue;
        System.out.println("Speed : " + Speed);
    }

    public void ChangeGear(int newValue) {
        Gear += newValue;
        System.out.println("Gear : " + Gear);
    }
    
}
