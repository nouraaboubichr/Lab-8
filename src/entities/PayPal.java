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
public class PayPal implements PaymentMethod {

    private String email;
    private double balance;

    public PayPal(String email, double balance) {
        this.email = email;
        this.balance = balance;
    }

    public boolean pay(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("PayPal (" + email + ") : paye " + amount + ", reste " + balance);
            return true;
        }

        System.out.println("PayPal (" + email + ") : fond insuffisant (" + amount + ") solde=" + balance);
        return false;
    }

    public boolean refund(double amount) {
        balance = balance + amount;
        System.out.println("PayPal (" + email + ") : rembourse " + amount + ", solde " + balance);
        return true;
    }

    public String getName() {
        return "PayPal[" + email + "]";
    }
}