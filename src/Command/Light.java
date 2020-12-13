/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;


import javax.swing.JLabel;
public class Light {
    
private JLabel label;
    public Light(JLabel label) {
        this.label=label;
    }
    
    
    
    public void on() {
        System.out.println("Light on");
        label.setVisible(true);
        
    }
    
    public void off() {
        System.out.println("Light off");
        label.setVisible(false);
    }
    
}
