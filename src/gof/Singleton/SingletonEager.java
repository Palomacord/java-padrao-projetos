package gof.Singleton;

public class SingletonEager {

    private static SingletonEager instance;

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        instance = new SingletonEager();
        return instance;
    }
}
