package prisoner;

public interface Prisoner {
    String getName();

    int getYearsTillRelease();

    CrimeType getCrimeType();

    String show();

    default boolean canHaveVisitors(){
        return true;
    }
}
