package army;

import classes.meleeDD.ElfWarrior;
import classes.rangeDD.ElfArcher;
import classes.wizards.ElfMage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmyOfElf extends Army {
    private static final Logger log = LoggerFactory.getLogger(ArmyOfElf.class);

    public ArmyOfElf() {
        super();

        log.info("Creating army of Elf's");

        getCasualFighters().add(new ElfMage());

        getCasualFighters().add(new ElfArcher());
        getCasualFighters().add(new ElfArcher());
        getCasualFighters().add(new ElfArcher());

        getCasualFighters().add(new ElfWarrior());
        getCasualFighters().add(new ElfWarrior());
        getCasualFighters().add(new ElfWarrior());
        getCasualFighters().add(new ElfWarrior());
    }
}
