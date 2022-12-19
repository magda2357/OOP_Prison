package prisonerType;

import prisoner.Prisoner;

public interface PrisonerType {
    void addPrisoner(Prisoner prisoner);

    void listPrisoners();

    Prisoner findPrisoner(String name);
}
