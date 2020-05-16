package classes.meleeDD;

import abilities.first_ability.FirstAbility;
import army.Army;
import classes.Soldier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElfWarrior extends Soldier implements FirstAbility {
    private static final Logger log = LoggerFactory.getLogger(ElfWarrior.class);

    private final String name = "Elf warrior";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void attack1(Army army) {

    }
}
