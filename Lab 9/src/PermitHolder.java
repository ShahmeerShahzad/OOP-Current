public class PermitHolder extends Person{

    private int ID;
    private static int count = 1000;

    PermitHolder(String name) {
        super(name);
        this.ID = count++;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(super.toString());
        str.append(", Permit ID: " + ID );
        return str.toString();
    }



}
