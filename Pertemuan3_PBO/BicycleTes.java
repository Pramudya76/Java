public class BicycleTes {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.Speed = 10;
        bike.Gear = 2;
        bike.ChangeSpeed(10);
        bike.ChangeGear(2);
        bike.ChangeGear(0);
        bike.ChangeSpeed(-17);
    }
}
