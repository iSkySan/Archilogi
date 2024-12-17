package ispnok;

public class Application {
    public static void main(String[] args) {
        // Violation de l'ISP
        Employe employe = new Employe();
        employe.travailler();
        employe.prendrePause();
        employe.dejeuner();

        EmployeMiTemps employeMitemps = new EmployeMiTemps();
        employeMitemps.travailler();
        employeMitemps.prendrePause();
        employeMitemps.dejeuner();
    }
}
