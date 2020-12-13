/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;
import javax.swing.JLabel;

public class Firework implements Element{
    private JLabel crackle,crackle1,crackle2,crown,crown1,crown2,fish,fish1,fish2;
    
    @Override
    public void draw() {
        crackle.setVisible(true);
        crackle1.setVisible(true);
        crackle2.setVisible(true);
        crown.setVisible(true);
        crown1.setVisible(true);
        crown2.setVisible(true);
        fish.setVisible(true);
        fish1.setVisible(true);
        fish2.setVisible(true);
    }
    
     @Override
    public void undraw() {
        crackle.setVisible(false);
        crackle1.setVisible(false);
        crackle2.setVisible(false);
        crown.setVisible(false);
        crown1.setVisible(false);
        crown2.setVisible(false);
        fish.setVisible(false);
        fish1.setVisible(false);
        fish2.setVisible(false);
    }

    public Firework() {
    }

    public Firework(JLabel crackle, JLabel crackle1, JLabel crackle2, JLabel crown, JLabel crown1, JLabel crown2, JLabel fish, JLabel fish1, JLabel fish2) {
        this.crackle = crackle;
        this.crackle1 = crackle1;
        this.crackle2 = crackle2;
        this.crown = crown;
        this.crown1 = crown1;
        this.crown2 = crown2;
        this.fish = fish;
        this.fish1 = fish1;
        this.fish2 = fish2;
    }
    
    
}
