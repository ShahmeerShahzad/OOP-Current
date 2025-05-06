public abstract class Shape {
    private String name;

    abstract double area();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
