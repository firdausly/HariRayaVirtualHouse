/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author alang
 */
public class LightOnCommand implements Command {
    Light light;

   

    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.on();
      
    }
    
}
