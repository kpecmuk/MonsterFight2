package classes.rangeDD;

import abilities.first_ability.FirstAbility;
import abilities.second_ability.SecondAbility;
import army.Army;
import classes.Soldier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UndeadArcher extends Soldier implements FirstAbility, SecondAbility {
    private static final Logger log = LoggerFactory.getLogger(UndeadArcher.class);

    private final String name = "Undead archer";

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
