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

public class PushNotification implements Notification {

    private String appId;

    public PushNotification(String appId) {
        this.appId = appId;
    }

    public void send(String recipient, String message) {
        System.out.println("[Push] App: " + appId + " User: " + recipient + " - " + message);
    }

    public int getPriority() {
        return 0;
    }

    public String getType() {
        return "Push";
    }
}