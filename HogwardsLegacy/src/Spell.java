
/**
 *
 * @author Jarukrit
 */
public abstract class Spell {

    private final String name;
    private int damage;

    public Spell(){
        this("");
    }
    public Spell(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
