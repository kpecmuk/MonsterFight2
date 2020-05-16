package army;

import classes.meleeDD.OrcGoblin;
import classes.rangeDD.OrcArcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import classes.wizards.OrcShaman;

public class ArmyOfOrc extends Army {
    private static final Logger log = LoggerFactory.getLogger(ArmyOfOrc.class);

    public ArmyOfOrc() {
        super();

        log.info("Creating army of Orc's");

        getCasualFighters().add(new OrcShaman());

        getCasualFighters().add(new OrcArcher());
        getCasualFighters().add(new OrcArcher());
        getCasualFighters().add(new OrcArcher());

        getCasualFighters().add(new OrcGoblin());
        getCasualFighters().add(new OrcGoblin());
        getCasualFighters().add(new OrcGoblin());
        getCasualFighters().add(new OrcGoblin());
    }
}
