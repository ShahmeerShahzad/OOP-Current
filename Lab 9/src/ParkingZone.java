public class ParkingZone {
    private String zoneID;
    private  Vehicle vehicles[] = new Vehicle[5];
    private int index = 0;
    private static int count = 0;

    ParkingZone() {
        this.zoneID = ("A" + count++);
    }

    public void addVehicle(Vehicle v) {
        vehicles[index++] = v;
    }
}
