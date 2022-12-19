import prisonerType.PrisonerType;
import utilities.Utility;

import java.util.ArrayList;
import java.util.List;

public class Prison {
    private Block block;
    private PrisonerType prisonerType;
    private VisitingRoom visitingRoom;

    private List<Utility> utilities = new ArrayList<>();

    public Prison(Block block, PrisonerType prisonerType) {
        this.block = block;
        this.prisonerType = prisonerType;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public PrisonerType getPrisonerType() {
        return prisonerType;
    }

    public void setPrisonerType(PrisonerType prisonerType) {
        this.prisonerType = prisonerType;
    }

    public VisitingRoom getVisitingRoom() {
        return visitingRoom;
    }

    public void setVisitingRoom(VisitingRoom visitingRoom) {
        this.visitingRoom = visitingRoom;
    }

    public List<Utility> getUtilities() {
        return utilities;
    }

    public void addUtility(Utility utility) {
        boolean isOpen = utility.open();

        if (isOpen) {
            utilities.add(utility);
        }
    }

}
