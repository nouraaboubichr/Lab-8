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

public class NotificationManager {

    private Notification[] channels;
    private int count;

    public NotificationManager() {
        channels = new Notification[3];
        count = 0;
    }

    public void addChannel(Notification n) {

        if (count == channels.length) {
            Notification[] tmp = new Notification[channels.length * 2];
            for (int i = 0; i < channels.length; i++) {
                tmp[i] = channels[i];
            }
            channels = tmp;
        }

        channels[count] = n;
        count++;
    }

    public void broadcast(String recipient, String message) {

        // copie du tableau utile
        Notification[] copy = new Notification[count];
        for (int i = 0; i < count; i++) {
            copy[i] = channels[i];
        }

        // tri par priorite decroissante (tri a bulles)
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (copy[j].getPriority() < copy[j + 1].getPriority()) {
                    Notification tmp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = tmp;
                }
            }
        }

        System.out.println("Broadcast to " + recipient + ":");

        for (int i = 0; i < count; i++) {
            Notification n = copy[i];
            System.out.print("Channel [" + n.getType() + ", prio=" + n.getPriority() + "]: ");
            n.send(recipient, message);
        }

        System.out.println();
    }
}