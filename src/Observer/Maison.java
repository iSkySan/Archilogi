package Observer;

public class Maison implements BoiteALettre {
    private String name;

     public Maison(String name) {
        this.name = name;
    }
    public void update(String message) {
        System.out.println("Maison " + name + " a reçu le message : " + message);
    }


}
