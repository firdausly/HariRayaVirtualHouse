/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import javax.swing.JLabel;


public class Pelita implements Element{
private JLabel pelita1,pelita2;
    @Override
    public void draw() {
     pelita1.setVisible(true);
     pelita2.setVisible(true);
    }
    
     @Override
    public void undraw() {
     pelita1.setVisible(false);
     pelita2.setVisible(false);
    }

    public Pelita(JLabel pelita1, JLabel pelita2) {
        this.pelita1 = pelita1;
        this.pelita2 = pelita2;
    }

    public Pelita() {
    }
    
    
   
}
