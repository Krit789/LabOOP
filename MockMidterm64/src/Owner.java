
/**
 *
 * @author Jarukrit
 */
public class Owner {

    private final String name;
    private Animal animal;

    public Owner() {
        this("", null);
    }

    public Owner(String name) {
        this(name, null);
    }

    public Owner(Animal animal) {
        this("", animal);
    }

    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void feedFood(Food f) {
        getAnimal().eat(f);
    }

    @Override
    public String toString() {
        return "Owner : name = " + getName() + ", Animal : name = " + getAnimal().getName() + ", power = " + getAnimal().getPower() + ", age = " + getAnimal().getAge();
    }

    public void protectOwnerFrom(Animal a) {
        Animal a1 = getAnimal();
        if (getAnimal() instanceof Dog) {
            Dog d1 = (Dog) a1;
            d1.kick(a);
        } else if (getAnimal() instanceof Pigeous) {
            Pigeous p1 = (Pigeous) a1;
            p1.wingAttack(a);
        }
    }

}
