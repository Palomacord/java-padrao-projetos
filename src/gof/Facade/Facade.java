package gof.Facade;

import gof.SubSystem1.CrmService;
import gof.SubSystem2.CepApi;

public class Facade {

    public void migrateClient(String name , String cep){
        String city = CepApi.getInstance().retornCity(cep);
        String state = CepApi.getInstance().retornState(cep);
        CrmService.saveClient(name,cep,city,state);
    }
}
