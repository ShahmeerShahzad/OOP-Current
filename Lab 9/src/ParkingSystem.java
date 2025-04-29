public class ParkingSystem {
    private String campusName;
    private Supervisor s1;
    private ParkingZone Zones[] = new ParkingZone[2];
    private PermitHolder Holders[] = new PermitHolder[2];
    private int zonesIndex = 0;
    private int holdersIndex = 0;
    private static int count = 0;

    ParkingSystem(String campusName, Supervisor s1) {
        if (count == 0) {
            this.campusName = campusName;
            this.s1 = s1;
            count++;
        }
        else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance");
        }
    }

    public static ParkingSystem getInstance(String campusName, Supervisor s1) {
        return new ParkingSystem(campusName,s1);
    }

    public void addZone(ParkingZone z1) {
        Zones[zonesIndex++] = z1;
    }

    public void addPermitHolder(PermitHolder p1) {
        Holders[holdersIndex++] = p1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Campus: " + campusName + "\n");
        return str.toString();
    }
}
