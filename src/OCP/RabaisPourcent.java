package OCP;

public class RabaisPourcent  implements TypeRabais {
   private final double pourcentage;

   public RabaisPourcent(double pourcentage) {
       this.pourcentage = pourcentage;
   }
   @Override
    public double AppliquerRabais(double montant) {
        return montant * (100 - pourcentage) / 100;
    }

}
