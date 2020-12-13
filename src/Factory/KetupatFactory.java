public class KetupatFactory {
 public Ketupat createKetupat(String type){
  Ketupat Ketupat=null;

  if(type.equals("Ketupat Palas")){
   Ketupat=new KetupatPalas();
  } else if(type.equals("Ketupat Bawang")) {
   Ketupat = new KetupatBawang();
  }
  return Ketupat;
 }

}
