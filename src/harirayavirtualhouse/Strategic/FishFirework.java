/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harirayavirtualhouse.Strategic;

/**
 *
 * @author alang
 */
public class FishFirework extends Firework {
    
    public FishFirework() {
        behavior=new Sparkle();
    }

    @Override
    public void Display() {
        System.out.println("");
    }
}
