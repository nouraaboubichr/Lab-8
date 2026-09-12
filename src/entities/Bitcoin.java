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

public class Bitcoin implements PaymentMethod {

    private String walletAddress;
    private double balance;

    public Bitcoin(String walletAddress, double balance) {
        this.walletAddress = walletAddress;
        this.balance = balance;
    }

    public boolean pay(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Bitcoin (" + walletAddress + ") : paye " + amount + " BTC, reste " + balance);
            return true;
        }

        System.out.println("Bitcoin (" + walletAddress + ") : fond insuffisant (" + amount + ") solde=" + balance);
        return false;
    }

    public boolean refund(double amount) {
        balance = balance + amount;
        System.out.println("Bitcoin (" + walletAddress + ") : rembourse " + amount + " BTC, solde " + balance);
        return true;
    }

    public String getName() {
        return "Bitcoin[" + walletAddress + "]";
    }
}
