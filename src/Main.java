import strategy.*;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pagando com cartão
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(250.00);

        // Pagando com PayPal
        context.setPaymentStrategy(new PaypalPayment("teste@exemplo.com"));
        context.executePayment(99.90);

        // Pagando com Pix
        context.setPaymentStrategy(new PixPayment("meuemail@pix.com"));
        context.executePayment(50.00);
    }
}