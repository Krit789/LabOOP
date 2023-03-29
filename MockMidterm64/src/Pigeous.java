
/**
 *
 * @author Jarukrit
 */
public class Pigeous extends Bird {

    public Pigeous() {
        super("", 0);
    }

    public Pigeous(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(Food f) {
        setPower(getPower() + (f.getPower() * 2));
    }

    @Override
    public void fly() {
        System.out.println(getName() + " fly fly ....");
    }

    @Override
    public void wingAttack(Animal a) {
        a.setPower(a.getPower() - 5);
    }

    public void wingAttack(Animal a, int times) {
        for (int x = 0; x < times; x++) {
            a.setPower(a.getPower() - 5);
        }
    }
}
