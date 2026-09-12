/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities1;

/**
 *
 * @author hp
 */

public class SMSNotification implements Notification {

    private String senderNumber;

    public SMSNotification(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public void send(String recipient, String message) {
        System.out.println("[SMS] From: " + senderNumber + " To: " + recipient + " - " + message);
    }

    public int getPriority() {
        return 2;
    }

    public String getType() {
        return "SMS";
    }
}
