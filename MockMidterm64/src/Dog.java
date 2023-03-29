
/**
 *
 * @author Jarukrit
 */
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, 200, age);
    }

    @Override
    public void eat(Food f) {
        setPower(getPower() + f.getPower());
    }

    public void kick(Animal a) {
        a.setPower(a.getPower() - 10);
    }
}
