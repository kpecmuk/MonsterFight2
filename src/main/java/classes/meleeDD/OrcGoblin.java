package classes.meleeDD;

import abilities.first_ability.FirstAbility;
import army.Army;
import classes.Soldier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * атака дубиной (нанесение урона 20 HP)
 *
 */

public class OrcGoblin extends Soldier implements FirstAbility {
    private static final Logger log = LoggerFactory.getLogger(OrcGoblin.class);

    private final String name = "Orc goblin";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void attack1(Army army) {

    }
}
