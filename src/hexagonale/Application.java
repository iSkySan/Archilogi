package hexagonale;

public class Application {
    public static void main(String[] args) {
        PersonneData personneData = new PersonneDataImpl();
        ServiceData serviceData = new ServiceDataImpl();
        LangueData langueData = new LangueDataImpl();
        RHDomaine rhDomaine = new RHDomaine(personneData, serviceData, langueData);
        ApplicationVue applicationVue = new ApplicationVue(rhDomaine);
        applicationVue.run();
    }
}
