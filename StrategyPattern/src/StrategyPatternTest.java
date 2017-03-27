import algorithms.fly.FlyRocketPowered;
import customer.Duck;
import customer.MallardDuck;
import customer.ModelDuck;

/**
 * Created by bacon on 2017/3/27.
 */
public class StrategyPatternTest {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
