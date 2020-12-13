/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import javax.swing.JLabel;


public class LightOn implements Element {
private JLabel lighton;
    @Override
    public void draw() {
            lighton.setVisible(true);
    }
    
     @Override
    public void undraw() {
      lighton.setVisible(false);
      
    }

    public LightOn(JLabel lighton) {
        this.lighton = lighton;
    }

    public LightOn() {
    }
    
    
    
}
