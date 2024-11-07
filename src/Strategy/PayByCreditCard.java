package Strategy;

public class PayByCreditCard implements PayStrategy{

    @Override
    public void pay(int montant) {
        System.out.println("Paiement de " + montant + " par carte de crédit");
    }

}
