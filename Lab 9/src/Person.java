public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name: " + name );
        return str.toString();
    }
}
