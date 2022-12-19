package prisonerType;

import prisoner.Prisoner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AdultPrisoner implements PrisonerType {
    private List<Prisoner> prisoners = new ArrayList<>();

    @Override
    public void addPrisoner(Prisoner prisoner) {
        prisoners.add(prisoner);
    }

    @Override
    public void listPrisoners() {
        System.out.println("Adult prisoners:");
        for (Prisoner prisoner : prisoners) {
            System.out.println("*" + prisoner.getName());
        }
    }

    @Override
    public Prisoner findPrisoner(String name) {
        Optional<Prisoner> foundPrisoner = prisoners.stream()
                .filter(prisoner -> prisoner.getName().equals(name))
                .findFirst();
        return foundPrisoner.orElseThrow(() -> new RuntimeException("Prisoner " + name + " not found."));
    }
}
