/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import javax.swing.JOptionPane;

/**
 *
 * @author alang
 */
public class PalmOilDecorator extends PelitaDecorator {
    
    public PalmOilDecorator(PelitaType decoratedPelita) {
        super(decoratedPelita);
    }
    
     public void draw() {
        decoratedPelita.draw();
        fillPalmOil(decoratedPelita);
    }

    private void fillPalmOil(PelitaType decoratedPelita) {
        String output="Fillings: Palm Oil";
        JOptionPane.showMessageDialog(null, output);
    }
    
    
}
