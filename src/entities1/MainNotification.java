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
public class MainNotification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NotificationManager mgr = new NotificationManager();

        mgr.addChannel(new EmailNotification("no-reply@monapp.com"));
        mgr.addChannel(new SMSNotification("+33123456789"));
        mgr.addChannel(new PushNotification("com.monapp.id"));

        mgr.broadcast("user@example.com", "Votre commande est expediee.");
        mgr.broadcast("+33987654321", "Votre code de verification est 123456.");
    }
    
}
