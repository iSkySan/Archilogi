package Chain_of_Responsibility;

public abstract class CentreAppel {
    private int level;
    private CentreAppel next;

    public CentreAppel(int level) {
        this.level = level;
    }
    public void setNext(CentreAppel next) {
        this.next = next;
    }
    public void traiterAppel(Appel appel) {
        if (appel.getLevel() == level) {
            System.out.println("Appel traité par le centre d'appel de niveau " + level);
        } else if (next != null) {
            System.out.println("Passage au centre d'appel suivant");
            next.traiterAppel(appel);
        } else {
            System.out.println("Aucun centre d'appel");
        }
    }


}
