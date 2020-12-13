/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import javax.swing.JOptionPane;


public class KeroseneOilDecorator extends PelitaDecorator{
    
    public KeroseneOilDecorator(PelitaType decoratedPelita) {
        super(decoratedPelita);
    }
    
    public void draw() {
        decoratedPelita.draw();
        fillKeroseneOil(decoratedPelita);
    }

    private void fillKeroseneOil(PelitaType decoratedPelita) {
        String output="Filling: Kerosene Oil";
        JOptionPane.showMessageDialog(null, output);
    }
    
}
