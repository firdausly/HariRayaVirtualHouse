package Strategic;


public abstract class Firework {
    fireBehavior behavior;

    public Firework(){};

    public String performFire(){
        return behavior.fire();
    }
    public abstract void Display();

    public void setBehavior(fireBehavior behavior){
        this.behavior=behavior;
    }
}
