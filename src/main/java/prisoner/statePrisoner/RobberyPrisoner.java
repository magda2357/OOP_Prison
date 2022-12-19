package prisoner.statePrisoner;

import prisoner.Prisoner;

public class RobberyPrisoner extends AbstractStatePrisoner {
    public RobberyPrisoner(String name, int yearsTillRelease, String lawyer) {
        super(name, yearsTillRelease, lawyer);
    }

    @Override
    public void callLawyer() {
        System.out.println("No lawyer available");
    }

}
