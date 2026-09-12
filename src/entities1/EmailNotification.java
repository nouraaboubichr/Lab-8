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

public class EmailNotification implements Notification {

    private String fromAddress;

    public EmailNotification(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public void send(String recipient, String message) {
        System.out.println("[Email] From: " + fromAddress + " To: " + recipient + " - " + message);
    }

    public int getPriority() {
        return 1;
    }

    public String getType() {
        return "Email";
    }
}
