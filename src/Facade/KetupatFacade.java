/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import javax.swing.JLabel;
/**
 *
 * @author alang
 */
public class KetupatFacade implements Element{
    private JLabel ketupat1,ketupat2,ketupat3,ketupat4;
    @Override
    public void draw() {
      ketupat1.setVisible(true);
      ketupat2.setVisible(true);
      ketupat3.setVisible(true);
      ketupat4.setVisible(true);
    }
    
     @Override
    public void undraw() {
      ketupat1.setVisible(false);
      ketupat2.setVisible(false);
      ketupat3.setVisible(false);
      ketupat4.setVisible(false);
    }

    public KetupatFacade() {
    }

    public KetupatFacade(JLabel ketupat1, JLabel ketupat2, JLabel ketupat3, JLabel ketupat4) {
        this.ketupat1 = ketupat1;
        this.ketupat2 = ketupat2;
        this.ketupat3 = ketupat3;
        this.ketupat4 = ketupat4;
    }
    
    
    
}
