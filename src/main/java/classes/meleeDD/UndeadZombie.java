package classes.meleeDD;

import abilities.first_ability.FirstAbility;
import army.Army;
import classes.Soldier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * удар копьем (нанесение урона 18 HP)
 *
 */

public class UndeadZombie extends Soldier implements FirstAbility {
    private static final Logger log = LoggerFactory.getLogger(UndeadZombie.class);

    private final String name = "Undead zombie";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void attack1(Army army) {

    }
}
