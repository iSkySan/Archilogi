package lspnok;

public class Application {
//    public static void main(String[] args) {
//        // Violation du LSP
//        Rectangle rect = new Rectangle();
//        rect.setHauteur(10);
//        rect.setLargeur(20);
//        System.out.println("Surface rectangle 10x20 : " + rect.getSurface());
//
//        Carre carre = new Carre();
//        carre.setHauteur(10);
//        carre.setLargeur(20);
//        System.out.println("Surface carré 10x20 : " + carre.getSurface());
//    }
    public static void main(String[] args) {
        // Respect du LSP
        Rectangle rect = new Rectangle();
        rect.setHauteur(10);
        rect.setLargeur(20);
        System.out.println("Surface rectangle 10x20 : " + rect.getSurface());

        Carre carre = new Carre();
        carre.setCote(10);
        System.out.println("Surface carré 10x10 : " + carre.getSurface());
    }
}
