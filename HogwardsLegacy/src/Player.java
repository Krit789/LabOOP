
/**
 *
 * @author Jarukrit
 */
public class Player {

    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;

    public Player() {
        this("", 20);
    }

    public Player(String name) {
        this(name, 20);
    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        if (hp >= 0 && hp <= 20) {
            this.hp = hp;
        } else if (hp < 0) {
            this.hp = 0;
        } else if (hp > 20) {
            this.hp = 20;
        }
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana >= 0 && mana <= 50) {
            this.mana = mana;
        } else if (mana < 0) {
            this.mana = 0;
        } else if (mana > 20) {
            this.mana = 50;
        }
    }

    public Houses getHouses() {
        return houses;
    }

    public void setHouses(Houses houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "[Player] : " + getName() + " HP: " + getHP() + " Mana: " + getMana() + " || " + getHouses();
    }

    public boolean equals(Player player) {
        return (player.getName().equals(getName()) && player.getHouses().equals(getHouses()));
    }

    public void attack(Player target, Spell spell) {
        if (getHouses() instanceof Hufflepuff) {
            Hufflepuff h1 = (Hufflepuff) getHouses();
            h1.attackSpell(this, target, spell);
        } else if (getHouses() instanceof Gryffindor) {
            Gryffindor h1 = (Gryffindor) getHouses();
            h1.attackSpell(this, target, spell);
        }
        if (target.getHP() == 0) {
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + getName());
        }
    }

    public void protectFromPlayer(Player target) {
        if (getHouses() instanceof Hufflepuff) {
            Hufflepuff h1 = (Hufflepuff) getHouses();
            h1.defense(this, target);
        } else if (getHouses() instanceof Gryffindor) {
            Gryffindor h1 = (Gryffindor) getHouses();
            h1.defense(this, target);
        }
    }
}
