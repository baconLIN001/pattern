package customer;

import algorithms.fly.FlyNoWay;
import algorithms.quack.Quack;

/**
 * Created by bacon on 2017/3/27.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("A model duck...");
    }
}
