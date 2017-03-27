package algorithms.fly;

/**
 * Created by bacon on 2017/3/27.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cant not fly...");
    }
}
