public class KetupatStore {
    KetupatPalasFactory factory;

    public KetupatStore(KetupatPalasFactory factory){
        this.factory=factory;
    }

    public Ketupat addKetupat(String type){
        Ketupat ketupat;
        ketupat=factory.createKetupat(type);
        return ketupat;
    }
}
