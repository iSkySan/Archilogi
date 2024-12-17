package OCP;

public class Rabaisfixe implements TypeRabais {
    private final double rabais;

    public Rabaisfixe(double rabais) {
        this.rabais = rabais;
    }
    @Override
    public double AppliquerRabais(double montant) {
        return montant - rabais;
    }
}
