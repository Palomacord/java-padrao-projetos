package gof.Strategy;

public class Robot {
    private Behavior strategy;

    public void setBehavior(Behavior strategy){
        this.strategy = strategy;
    }

    public void move(){
        strategy.mover();
    }
}
