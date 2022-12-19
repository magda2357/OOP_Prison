import prisoner.Prisoner;
import prisoner.federalPrisoner.IdentityTheftPrisoner;
import prisoner.federalPrisoner.TaxFraudPrisoner;
import prisoner.statePrisoner.HomicidePrisoner;
import prisoner.statePrisoner.RobberyPrisoner;
import prisonerType.AdultPrisoner;
import prisonerType.PrisonerType;
import prisonerType.YouthfulPrisoner;
import utilities.Bathroom;
import utilities.Cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Block block = new Block();
        System.out.println(block.getBlockCapacity());

        block.setNumberOfBedsPerCell(2);
        System.out.println(block.getBlockCapacity());

        block.setNumberOfBedsPerCell(4);
        System.out.println(block.getBlockCapacity());

        System.out.println("---------");

        TaxFraudPrisoner taxFraudPrisoner1 = new TaxFraudPrisoner("Anna W", 15, 20);
        IdentityTheftPrisoner identityTheftPrisoner1 = new IdentityTheftPrisoner("Grzegorz K", 10);
        HomicidePrisoner homicidePrisoner1 = new HomicidePrisoner("Wania K", 1000, "Wakefield & Partners", true);

        PrisonerType prisonerType1 = new AdultPrisoner();
        prisonerType1.addPrisoner(taxFraudPrisoner1);
        prisonerType1.addPrisoner(identityTheftPrisoner1);
        prisonerType1.addPrisoner(homicidePrisoner1);

        prisonerType1.listPrisoners();
        System.out.println();
        System.out.println(prisonerType1.findPrisoner("Anna W").show());
        System.out.println();

        System.out.print(identityTheftPrisoner1.getName() + ": ");
        identityTheftPrisoner1.applyForEarlyRelease();
        System.out.println();

        System.out.print(taxFraudPrisoner1.getName() + ": ");
        System.out.println(taxFraudPrisoner1.getYearsTillRelease()
                + " years left, but if misbehave can increase to max penalty of " + taxFraudPrisoner1.getMaxPenalty());
        taxFraudPrisoner1.transferToOtherPrison();
        System.out.println();

        System.out.println(homicidePrisoner1.getName() + ": lawyer " + homicidePrisoner1.getLawyer());
        System.out.println("Life sentence? " + homicidePrisoner1.isLifeSentence());
        homicidePrisoner1.callLawyer();
        System.out.println("Can have visitors? "+ homicidePrisoner1.canHaveVisitors());
        System.out.println();

        System.out.println("---------");

        IdentityTheftPrisoner identityTheftPrisoner2 = new IdentityTheftPrisoner("Daria U", 2);
        RobberyPrisoner robberyPrisoner1 = new RobberyPrisoner("Aleksander T", 5, "Walter W");

        PrisonerType prisonerType2 = new YouthfulPrisoner();
        prisonerType2.addPrisoner(identityTheftPrisoner2);
        prisonerType2.addPrisoner(robberyPrisoner1);

        prisonerType2.listPrisoners();
        System.out.println();
        System.out.println(prisonerType2.findPrisoner("Daria U").show());
        System.out.println();

        System.out.print(robberyPrisoner1.getName() + ": lawyer " + robberyPrisoner1.getLawyer());
        robberyPrisoner1.callLawyer();
        System.out.println("Can have visitors? "+ robberyPrisoner1.canHaveVisitors());
        System.out.println();


        System.out.print(identityTheftPrisoner2.getName() + ": ");
        identityTheftPrisoner2.applyForEarlyRelease();

        System.out.println("---------");

        Prison prison = new Prison(block, prisonerType1);

        Bathroom bathroom1 = new Bathroom("Bathroom showers");
        Bathroom bathroom2 = new Bathroom("Bathroom toilets");
        Cafeteria cafeteria = new Cafeteria("Main cafeteria");

        prison.addUtility(bathroom1);
        bathroom1.clean();
        prison.addUtility(bathroom1);
        prison.addUtility(bathroom2);
        bathroom2.clean();
        prison.addUtility(bathroom2);
        prison.addUtility(cafeteria);

        bathroom1.closed();
        bathroom1.open();
        bathroom1.clean();
        bathroom1.open();

        System.out.println("---------");

        TaxFraudPrisoner taxFraudPrisonerL = new TaxFraudPrisoner("Robert F", 1, 2);
        IdentityTheftPrisoner identityTheftPrisonerL = new IdentityTheftPrisoner("Ola M", 12);

        List<Prisoner> newPrisoners = new ArrayList<>();
        newPrisoners.add(taxFraudPrisonerL);
        newPrisoners.add(identityTheftPrisonerL);

        for (Prisoner prisoner : newPrisoners) {
            if (prisoner instanceof IdentityTheftPrisoner) {
                System.out.println(prisoner.getName() + " This is identity theft prisoner");
            } else if (prisoner instanceof TaxFraudPrisoner) {
                System.out.println(prisoner.getName() + " This is tax fraud prisoner");
            }
        }
    }
}
