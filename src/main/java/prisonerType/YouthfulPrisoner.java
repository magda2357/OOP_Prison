package prisonerType;

import prisoner.Prisoner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class YouthfulPrisoner implements PrisonerType {
    private Map<String, Prisoner> prisoners = new HashMap<>();

    @Override
    public void addPrisoner(Prisoner prisoner) {
        prisoners.put(prisoner.getName(), prisoner);
    }

    @Override
    public void listPrisoners() {
        Collection<Prisoner> prisonerCollection = prisoners.values();
        System.out.println("Youthful prisoners:");

        for (Prisoner prisoner : prisonerCollection) {
            System.out.println("*" + prisoner.getName());
        }
    }

    @Override
    public Prisoner findPrisoner(String name) {
        return prisoners.get(name);
    }
}
