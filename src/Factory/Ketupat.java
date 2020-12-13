

public abstract class Ketupat {
    String name;
    String shape;


    public Ketupat() {
    }

    @Override
    public String toString() {
        return "Ketupat Selected : " + name + ", shape=" + shape ;
    }

        
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    
    
    
}
