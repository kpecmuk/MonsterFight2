package classes.wizards;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import classes.Soldier;

/**
 * наложение улучшения на персонажа своего отряда
 * наложение проклятия (снятие улучшения с персонажа противника для следующего хода)
 *
 */

public class OrcShaman extends Soldier {
    private static final Logger log = LoggerFactory.getLogger(OrcShaman.class);

    private final String name = "Shaman";

    @Override
    public String getName() {
        return name;
    }
}
