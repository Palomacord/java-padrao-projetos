package gof.Strategy;

public class NormalBehavior extends Behavior {
    @Override
    public void mover() {
        System.out.println("Moving normally");
    }
}
