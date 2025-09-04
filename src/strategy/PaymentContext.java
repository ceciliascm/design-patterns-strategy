package strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null) {
            System.out.println("Nenhuma forma de pagamento selecionada!");
        } else {
            strategy.pay(amount);
        }
    }
}