package prisoner.statePrisoner;

import prisoner.AbstractPrisoner;
import prisoner.CrimeType;

public abstract class AbstractStatePrisoner extends AbstractPrisoner implements StatePrisoner {
    protected String lawyer;

    protected AbstractStatePrisoner(String name, int yearsTillRelease, String lawyer) {
        super(name, yearsTillRelease);

        this.lawyer = lawyer;
    }

    public String getLawyer() {
        return lawyer;
    }

    @Override
    public CrimeType getCrimeType() {
        return CrimeType.STATE;
    }

}
