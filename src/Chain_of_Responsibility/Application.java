package Chain_of_Responsibility;

public class Application {

    public static void main(String[] args) {
        CentreAppel centreAppel1 = new CentreAppelLevel1();
        CentreAppel centreAppel2 = new CentreAppelLevel2();
        CentreAppel centreAppel3 = new CentreAppelLevel3();
        CentreAppel centreAppel4 = new CentreAppelLevel4();

        centreAppel1.setNext(centreAppel2);
        centreAppel2.setNext(centreAppel3);
        centreAppel3.setNext(centreAppel4);


        Appel appel = new Appel(1, "Probleme de connexion");
        centreAppel1.traiterAppel(appel);
        appel = new Appel(2, "Probleme de facturation");
        centreAppel1.traiterAppel(appel);
        appel = new Appel(3, "Probleme de electricite");
        centreAppel1.traiterAppel(appel);
        appel = new Appel(4, "oskour");
        centreAppel1.traiterAppel(appel)



        ;
    }
}
