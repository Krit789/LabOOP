
/**
 *
 * @author Jarukrit
 */
public abstract class Player {

    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        if (HP >= 0) {
            this.HP = HP;
        } else {
            this.HP = 0;
        }
    }

    public double getMP() {
        return MP;
    }

    public void setMP(double MP) {
        this.MP = MP;
    }

    public double getEXP() {
        return EXP;
    }

    public void setEXP(double EXP) {
        this.EXP = EXP;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }

    public double getATK() {
        return ATK;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    @Override
    public String toString() {
        return "HP : " + getHP() + " MP : " + getMP() + " ATK : " + getATK();
    }

    public abstract void attack(Player p);

    public abstract void attacked(double n);
}
