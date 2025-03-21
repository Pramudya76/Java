class MountainBike extends sepeda {
    int height;
    public void setHeight(int newValue) {
        this.height = newValue;
        System.out.println("Height : " + height);
    }

 }




public class MountainBikeDemo {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike();
        bike.setHeight(10);
        bike.changeGear(2);
        bike.speedUp(6);
    }
}
