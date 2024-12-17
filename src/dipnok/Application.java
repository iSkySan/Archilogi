package dipnok;

public class Application {
    public static void main(String[] args) {
        // Violation du DIP
       // Interrupteur interrupteur = new Interrupteur(new Lampe());
     //   interrupteur.action();

        // Respect du DIP
        Appareil lampe = new Lampe();
        Interrupteur interrupteur = new Interrupteur(lampe);
        interrupteur.action();
    }
}
