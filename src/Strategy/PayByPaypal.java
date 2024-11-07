package Strategy;

public class PayByPaypal implements PayStrategy{

    @Override
    public void pay(int montant) {
        System.out.println("Paiement de " + montant + " par Paypal");
    }

}
