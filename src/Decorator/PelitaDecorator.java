/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

public abstract class PelitaDecorator implements PelitaType {
    
    protected PelitaType decoratedPelita;
    
    public PelitaDecorator(PelitaType decoratedPelita){
        this.decoratedPelita=decoratedPelita;
    }
    
    public void draw(){
        decoratedPelita.draw();
    }
    
}
