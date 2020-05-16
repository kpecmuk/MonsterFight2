package classes.rangeDD;

import abilities.first_ability.FirstAbility;
import abilities.second_ability.SecondAbility;
import army.Army;
import classes.Soldier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * стрелять из арбалета (нанесение урона 5 HP)
 * атаковать (нанесение урона 3 HP)
 */

public class HumanCrossbow extends Soldier implements FirstAbility, SecondAbility {
    private static final Logger log = LoggerFactory.getLogger(HumanCrossbow.class);

    private final String name = "Human crossbow";

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
