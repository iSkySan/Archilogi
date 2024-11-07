package Strategy;

public class Context {
    private PayStrategy strategy;

    public Context(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(PayStrategy strategy) {
        this.strategy = strategy;
    }
    public void pay(int montant) {
        strategy.pay(montant);
    }

}
