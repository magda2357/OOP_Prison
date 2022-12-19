package prisoner.statePrisoner;

import prisoner.Prisoner;

public class HomicidePrisoner extends AbstractStatePrisoner {
    private final boolean lifeSentence;

    public HomicidePrisoner(String name, int yearsTillRelease, String lawyer, boolean lifeSentence) {
        super(name, yearsTillRelease, lawyer);

        this.lifeSentence = lifeSentence;
    }

    @Override
    public void callLawyer() {
        System.out.println("Prisoner talked to lawyer.");
    }

    @Override
    public boolean canHaveVisitors() {
        return false;
    }

    public boolean isLifeSentence() {
        return lifeSentence;
    }

    public String getName() {
        return "Homicide prisoner - identity hidden";
    }

}
