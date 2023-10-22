package gof.SubSystem2;

import gof.Singleton.SingletonLazyHolder;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String retornCity(String cep){
        return "Salvador";
    }

    public String retornState(String cep){
        return "Bahia";
    }
}
