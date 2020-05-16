package army;

import classes.meleeDD.HumanWarrior;
import classes.rangeDD.HumanCrossbow;
import classes.wizards.HumanMage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmyOfHuman extends Army {
    private static final Logger log = LoggerFactory.getLogger(ArmyOfHuman.class);

    public ArmyOfHuman() {
        super();

        log.info("Creating army of Human's");

        getCasualFighters().add(new HumanMage());

        getCasualFighters().add(new HumanCrossbow());
        getCasualFighters().add(new HumanCrossbow());
        getCasualFighters().add(new HumanCrossbow());

        getCasualFighters().add(new HumanWarrior());
        getCasualFighters().add(new HumanWarrior());
        getCasualFighters().add(new HumanWarrior());
        getCasualFighters().add(new HumanWarrior());
    }
}
