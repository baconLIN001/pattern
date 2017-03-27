package customer;

import algorithms.fly.FlyBehavior;
import algorithms.quack.QuackBehavior;

/**
 * Created by bacon on 2017/3/27.
 */
public abstract class Duck {
    //算法对象
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    //构造函数
    public Duck(){

    }

    //abstract函数，继承后不同实现
    public abstract void display();

    //算法运行函数
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    //统一函数，所有子类都能用
    public void swim(){
        System.out.println("All ducks float...");
    }

    //setter和getter，动态改变算法对象
    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
