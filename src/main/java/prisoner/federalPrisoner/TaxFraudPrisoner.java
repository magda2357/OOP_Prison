package prisoner.federalPrisoner;

import prisoner.Prisoner;

public class TaxFraudPrisoner extends AbstractFederalPrisoner {
    private final int maxPenalty;

    public TaxFraudPrisoner(String name, int yearsTillRelease, int maxPenalty) {
        super(name, yearsTillRelease);

        this.maxPenalty = maxPenalty;
    }

    public int getMaxPenalty() {
        return maxPenalty;
    }

    public void transferToOtherPrison() {
        System.out.println("Prisoner " + this.getName() + " transferred to different prison.");
    }

}
