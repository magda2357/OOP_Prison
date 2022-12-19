package utilities;

public class Cafeteria implements Utility {
    private String name;

    public Cafeteria(String name) {
        this.name = name;
    }

    @Override
    public boolean open() {
        System.out.println(name.toUpperCase() + " is open.");
        return true;
    }

    @Override
    public boolean closed() {
        System.out.println(name.toUpperCase() + " is closed.");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
