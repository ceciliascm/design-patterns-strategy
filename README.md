# 💳 Projeto de Pagamentos com Strategy Pattern para Projeto de o Bootcamp GFT Start #7 - Java

Este projeto demonstra o uso do **Padrão de Projeto Strategy** em Java, simulando um sistema de pagamentos com diferentes métodos (Cartão de Crédito, PayPal e Pix).

---

## 📌 O que é o Strategy Pattern?

O **Strategy** é um padrão de projeto comportamental que permite definir uma **família de algoritmos** (estratégias), encapsulá-los e torná-los **intercambiáveis** em tempo de execução.

👉 Em outras palavras: o cliente pode escolher **qual estratégia usar**, sem que o contexto precise conhecer os detalhes da implementação.

No projeto:
- `PaymentStrategy` → Interface (contrato que todas as estratégias seguem).  
- `CreditCardPayment`, `PaypalPayment`, `PixPayment` → Estratégias concretas de pagamento.  
- `PaymentContext` → Classe que usa a interface e permite trocar a estratégia.  
- `Main` → Ponto de entrada que simula diferentes formas de pagamento.  

---

Cecília Costa.
