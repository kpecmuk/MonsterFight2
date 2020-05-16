package team;

import army.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 08.02.2018
 */

public class CreateTeam {
    private static final Logger log = LoggerFactory.getLogger(CreateTeam.class);

    private final Army army;

    public CreateTeam(Army army) {
        this.army = army;
    }

    public Army getArmy() {
        return this.army;
    }
}
