import army.ArmyOfElf;
import army.ArmyOfHuman;
import army.ArmyOfOrc;
import army.ArmyOfUndead;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.CreateTeam;

import java.security.SecureRandom;

/**
 * @author kpecmuk
 * @since 08.05.2020
 */

public class Runner {
    private static final Logger log = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        log.info("Start");
        SecureRandom secureRandom = new SecureRandom();

        CreateTeam teamOne = new CreateTeam(secureRandom.nextBoolean() ? new ArmyOfOrc() : new ArmyOfUndead());
//        teamOne.getArmy().showMeArmy();

        CreateTeam teamTwo = new CreateTeam(secureRandom.nextBoolean() ? new ArmyOfElf() : new ArmyOfHuman());
//        teamTwo.getArmy().showMeArmy();

        log.info("End");
    }
}
