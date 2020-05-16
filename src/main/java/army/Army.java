package army;

import classes.Soldier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public abstract class Army {
    private static final Logger log = LoggerFactory.getLogger(Army.class);

    private final Set<Soldier> casualFighters = new HashSet<>();
    private final Set<Soldier> eliteFighters = new HashSet<>();

    public Set<Soldier> getCasualFighters() {
        return casualFighters;
    }

    public Set<Soldier> getEliteFighters() {
        return eliteFighters;
    }

    protected Army() {
        this.casualFighters.clear();
        this.eliteFighters.clear();
    }

    public void showMeArmy() {
        for (Soldier casualFighter : eliteFighters) {
            System.out.println(casualFighter.getName());
        }

        for (Soldier casualFighter : casualFighters) {
            System.out.println(casualFighter.getName());
        }
    }

    public void showEliteFighters() {
        for (Soldier eliteFighter : eliteFighters) {
            System.out.println(eliteFighter.getName());
        }
    }

    public void showCasualFighters() {
        for (Soldier casualFighter : casualFighters) {
            System.out.println(casualFighter.getName());
        }
    }

    public String getName() {
        return "noname";
    }
}
