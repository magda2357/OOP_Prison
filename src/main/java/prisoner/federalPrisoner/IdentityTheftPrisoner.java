package prisoner.federalPrisoner;

import prisoner.Prisoner;

public class IdentityTheftPrisoner extends AbstractFederalPrisoner {
    public IdentityTheftPrisoner(String name, int yearsTillRelease) {
        super(name, yearsTillRelease);
    }

    public void applyForEarlyRelease() {
        System.out.println("Please, let me out earlier.");
    }

}
