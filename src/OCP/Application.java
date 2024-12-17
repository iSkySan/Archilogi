package OCP;

public class Application {
    public static void main(String[] args) {

        RabaisPourcent rabaisPourcent = new RabaisPourcent(10);
        Rabaisfixe rabaisfixe = new Rabaisfixe(5);

        System.out.println("1000€ après rabais fixe : " +rabaisPourcent.AppliquerRabais(100)+"€");
        System.out.println("1000€ après rabais porcentage : " + rabaisfixe.AppliquerRabais(100)+"€");
    }

}
