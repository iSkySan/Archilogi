package OCP;
 class Rabais {

    public double calculerRabaisPourcent(double montant, double rabais) {
        return montant * (100 - rabais) / 100;
    }

    public double calculerRabaisFixe(double montant, double rabais) {
        return montant - rabais;
    }
}
