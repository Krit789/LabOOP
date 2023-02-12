/**
 *
 * @author Jarukrit
 */
public class Plane extends Vehicle{
public void showPlaneInfo(){
    System.out.println("Plane detail is, Fuel is " + super.getFuel() +" litre and Top Speed is " + super.getTopSpeed() + " m/s.");
}
public void setPlaneInfo(int s, String t){
    setFuel(s);
    setTopSpeed(t);
}

public void fly(){
    if (getFuel() - 200 < 0){
        System.out.println("Please add fuel.");
    } else {
        setFuel(getFuel() - 200);
        System.out.println("Fly.");
    }
}
}
