public class KetupatStore {
    KetupatFactory factory;

    public KetupatStore(KetupatFactory factory){
        this.factory=factory;
    }

    public Ketupat addKetupat(String type){
        Ketupat ketupat;
        ketupat=factory.createKetupat(type);
        return ketupat;
    }
}
