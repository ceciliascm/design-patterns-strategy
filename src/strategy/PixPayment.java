package strategy;

public class PixPayment implements PaymentStrategy {
    private String chavePix;

    public PixPayment(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagando R$" + amount + " via PIX com chave " + chavePix);
    }
}

