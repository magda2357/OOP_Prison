package prisoner.federalPrisoner;

import prisoner.AbstractPrisoner;
import prisoner.CrimeType;

public abstract class AbstractFederalPrisoner extends AbstractPrisoner {

    protected AbstractFederalPrisoner(String name, int yearsTillRelease) {
        super(name, yearsTillRelease);
    }

    @Override
    public CrimeType getCrimeType() {
        return CrimeType.FEDERAL;
    }
}
