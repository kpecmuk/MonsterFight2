package classes.wizards;

import abilities.first_ability.FirstAbility;
import abilities.second_ability.SecondAbility;
import army.Army;
import classes.Soldier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * наложение улучшения на персонажа своего отряда
 * атаковать магией (нанесение урона 4 HP)
 *
 */

public class HumanMage extends Soldier implements FirstAbility, SecondAbility {
    private static final Logger log = LoggerFactory.getLogger(HumanMage.class);

    private final String name = "Human mage";

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
