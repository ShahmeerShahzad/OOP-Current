public class Vehicle {
    public String licensePlate;
    private String type;
    private Owner owner;

    Vehicle(String licensePlate, String type, Owner owner) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
    }
}
