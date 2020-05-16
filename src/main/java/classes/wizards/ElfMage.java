package classes.wizards;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import abilities.first_ability.FirstAbility;
import abilities.second_ability.SecondAbility;
import army.Army;
import classes.Soldier;

/**
 * наложение улучшения на персонажа своего отряда
 * нанесение урона персонажу противника магией на 10 HP
 *
 */

public class ElfMage extends Soldier implements FirstAbility, SecondAbility {
    private static final Logger log = LoggerFactory.getLogger(ElfMage.class);

    private final String name = "Elf mage";

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void attack1(Army army) {

    }

    @Override
    public void attack2(Army army) {

    }
}
