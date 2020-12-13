/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;



public class EveryThingOn {
    private Element Firework;
    private Element Ketupat;
    private Element LightOn;
    private Element Pelita;
    
   
    public EveryThingOn() {
      Firework = new Firework();
      Ketupat = new KetupatFacade();
      LightOn = new LightOn();
      Pelita = new Pelita();
   }
    
    

    public Element getFirework() {
        return Firework;
    }

    public void setFirework(Element Firework) {
        this.Firework = Firework;
    }

    public Element getKetupat() {
        return Ketupat;
    }

    public void setKetupat(Element Ketupat) {
        this.Ketupat = Ketupat;
    }

    public Element getLightOn() {
        return LightOn;
    }

    public void setLightOn(Element LightOn) {
        this.LightOn = LightOn;
    }

    public Element getPelita() {
        return Pelita;
    }

    public void setPelita(Element Pelita) {
        this.Pelita = Pelita;
    }
    
    
    
    public void drawFirework(){
        Firework.draw();
    }
    
    public void drawKetupat(){
        Ketupat.draw();
    }
    
    public void drawLightOn(){
        LightOn.draw();
    }
    
    public void drawPelita(){
        Pelita.draw();
    }
    
       public void undrawFirework(){
        Firework.undraw();
    }
    
    public void undrawKetupat(){
        Ketupat.undraw();
    }
    
    public void undrawLightOn(){
        LightOn.undraw();
    }
    
    public void undrawPelita(){
        Pelita.undraw();
    }
    
    
}
