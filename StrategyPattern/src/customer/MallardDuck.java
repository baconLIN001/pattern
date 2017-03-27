package customer;

import algorithms.fly.FlyWithWings;
import algorithms.quack.Quack;

/**
 * Created by bacon on 2017/3/27.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("A Mallard duck...");
    }
}
