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
public class NormalPelita implements PelitaType {

    @Override
    public void draw() {
         String output="Type: Normal Pelita";
        JOptionPane.showMessageDialog(null, output);
    }
    
}
