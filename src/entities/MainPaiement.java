/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hp
 */
public class MainPaiement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PaymentProcessor processor = new PaymentProcessor();

        processor.addMethod(new CreditCard("1234-5678-9012-3456", "Alice Dupont", 500.0));
        processor.addMethod(new PayPal("bob@example.com", 200.0));
        processor.addMethod(new Bitcoin("1A2b3C4d5E", 0.10));

        double montant = 100.0;
        processor.processPayments(montant);
    }
    
}
