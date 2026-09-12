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

public interface Notification {

    void send(String recipient, String message);

    int getPriority();

    String getType();
}
