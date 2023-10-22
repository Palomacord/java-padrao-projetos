package gof.SubSystem1;

public class CrmService {

    public CrmService(){
        super();
    }
    public static void saveClient(String name, String cep,String city, String State){
        System.out.println("Customer saved in the CRM system");
        System.out.println("Infos:");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(State);

    }
}
