package classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Soldier {
    private static final Logger log = LoggerFactory.getLogger(Soldier.class);

    private int health = 100;
    private boolean buff = false;
    private boolean debuff = false;

    private boolean isLive() {
        return health > 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean doDamage(int damage) {
        this.health -= damage;
        return isLive();
    }

    public boolean buffCheck() {
        return buff;
    }

    public void setBuff(boolean buff) {
        this.buff = buff;
    }

    public boolean checkDebuff() {
        return debuff;
    }

    public void setDebuff(boolean debuff) {
        this.debuff = debuff;
    }

    public String getName() {
        return "name";
    }
}
