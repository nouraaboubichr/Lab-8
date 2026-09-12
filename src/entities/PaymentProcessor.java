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

public class PaymentProcessor {

    private PaymentMethod[] methods;
    private int count;

    public PaymentProcessor() {
        methods = new PaymentMethod[3];
        count = 0;
    }

    public void addMethod(PaymentMethod m) {

        if (count == methods.length) {
            PaymentMethod[] tmp = new PaymentMethod[methods.length * 2];
            for (int i = 0; i < methods.length; i++) {
                tmp[i] = methods[i];
            }
            methods = tmp;
        }

        methods[count] = m;
        count++;
    }

    public void processPayments(double amount) {

        System.out.println("=== Traitement des paiements de " + amount + " ===");

        for (int i = 0; i < count; i++) {
            PaymentMethod m = methods[i];
            System.out.println("-> Via " + m.getName());

            boolean paid = m.pay(amount);
            if (paid) {
                m.refund(amount / 2);
            }

            System.out.println();
        }
    }
}
