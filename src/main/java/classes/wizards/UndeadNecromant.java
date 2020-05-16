package classes.wizards;

import classes.Soldier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * наслать недуг (уменьшение силы урона персонажа противника на 50% на один ход)
 * атака (нанесение урона 5 HP)
 */

public class UndeadNecromant extends Soldier {
    private static final Logger log = LoggerFactory.getLogger(UndeadNecromant.class);

    private final String name = "Necromant";

    @Override
    public String getName() {
        return name;
    }
}
