package army;

import classes.meleeDD.UndeadZombie;
import classes.rangeDD.UndeadArcher;
import classes.wizards.UndeadNecromant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmyOfUndead extends Army {
    private static final Logger log = LoggerFactory.getLogger(ArmyOfUndead.class);

    public ArmyOfUndead() {
        super();

        log.info("Creating army of Undead");

        getCasualFighters().add(new UndeadNecromant());

        getCasualFighters().add(new UndeadArcher());
        getCasualFighters().add(new UndeadArcher());
        getCasualFighters().add(new UndeadArcher());

        getCasualFighters().add(new UndeadZombie());
        getCasualFighters().add(new UndeadZombie());
        getCasualFighters().add(new UndeadZombie());
        getCasualFighters().add(new UndeadZombie());
    }
}
