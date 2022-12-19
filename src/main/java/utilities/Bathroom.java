package utilities;

public class Bathroom implements Utility {
    private String name;
    private boolean cleaned = false;

    public Bathroom(String name) {
        this.name = name;
    }

    @Override
    public boolean closed() {
        System.out.println(name.toUpperCase() + " is closed.");
        cleaned=false;
        return true;
    }

    @Override
    public boolean open() {
        if (!cleaned) {
            System.out.println(name.toUpperCase() + " is not cleaned. Please clean first.");
            return false;
        } else {
            System.out.println(name.toUpperCase() + " is clean and open.");
            return true;
        }
    }

    public void clean() {
        System.out.println("Cleaned.");
        cleaned = true;
    }

    @Override
    public String getName() {
        return name;
    }
}
