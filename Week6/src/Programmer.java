
/**
 *
 * @author Jarukrit
 */
public class Programmer extends Employee {

    private int happiness;

    public void coding(String str) {
        if (getEnergy() >= 30) {
            System.out.println("Your code is " + str);
            setEnergy(getEnergy() - 30);
            setHappiness(getHappiness() - 30);
        } else {
            System.out.println("Error Error Error");
            setEnergy(getEnergy() - 30);
            setHappiness(getHappiness() - 30);
        }
    }

    public void coding(char str) {
        int deduction;
        if (this instanceof SeniorProgrammer) {
            deduction = 5;
        } else {
            deduction = 30;
        }
        if (getEnergy() >= 30) {
            if (this instanceof SeniorProgrammer) {
                System.out.println("I'm coding about " + str);
            } else {
                System.out.println("Your code is " + str);
            }

            setEnergy(getEnergy() - deduction);
            setHappiness(getHappiness() - deduction);
        } else {
            System.out.println("Error Error Error");
            setEnergy(getEnergy() - deduction);
            setHappiness(getHappiness() - deduction);
        }
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
