package prisoner;

public abstract class AbstractPrisoner implements Prisoner {
    private String name;
    private int yearsTillRelease;

    protected AbstractPrisoner(String name, int yearsTillRelease) {
        this.name = name;
        this.yearsTillRelease = yearsTillRelease;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getYearsTillRelease() {
        return this.yearsTillRelease;
    }

    public String show() {
        return "Prisoner: " + this.getName() + ", " + this.getCrimeType()
                + ", years till release: " + this.getYearsTillRelease();
    }
}
