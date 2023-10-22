package gof;

import gof.Facade.Facade;
import gof.Singleton.SingletonEager;
import gof.Singleton.SingletonLazy;
import gof.Singleton.SingletonLazyHolder;
import gof.Strategy.*;

public class Test {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Strategy

        Behavior behavior = new Behavior();
        Behavior defense = new DefenseBehavior();
        Behavior normal = new NormalBehavior();
        Behavior aggressively = new AggressivelyBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.setBehavior(aggressively);
        robot.move();
        robot.setBehavior(defense);
        robot.move();


        //Facade
        Facade facade = new Facade();
        facade.migrateClient("Paloma","41325132");
    }
}
