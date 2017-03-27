package algorithms.quack;

/**
 * Created by bacon on 2017/3/27.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence >>");
    }
}
