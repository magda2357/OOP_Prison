public class Block {
    private int numberOfCells = 100;
    private int bedsPerCell = 1;

    public static int MAX_BEDS_PER_CELL = 3;

    public static int getMaxBedsPerCell() {
        return MAX_BEDS_PER_CELL;
    }

    public void setNumberOfBedsPerCell(int beds) {
        if (beds <= getMaxBedsPerCell()) {
            bedsPerCell = beds;
        } else {
            System.out.println("Change forbidden. Maximum number of beds per cell is: " + getMaxBedsPerCell());
        }
    }

    public String getBlockCapacity() {
        return numberOfCells * bedsPerCell + "beds, (number of cells " + numberOfCells +
                ", number of beds per cell: " + bedsPerCell + ")";
    }

}
