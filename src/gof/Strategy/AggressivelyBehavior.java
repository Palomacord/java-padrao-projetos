package gof.Strategy;

public class AggressivelyBehavior extends Behavior {
    @Override
    public void mover() {
        System.out.println("Moving aggressively");
    }
}
