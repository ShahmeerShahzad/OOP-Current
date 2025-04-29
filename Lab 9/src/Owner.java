public class Owner extends Person{

    private String ownerId;
    private int index = 0;

    Owner(String name) {
        super(name);
        this.ownerId = "O" + String.format("%03d",index++);
    }

}
