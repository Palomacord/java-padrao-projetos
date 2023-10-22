package gof.Strategy;

public class DefenseBehavior extends Behavior {
    @Override
    public void mover() {
        System.out.println("Moving defense");
    }
}
