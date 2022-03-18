import java.util.ArrayList;

public class Toko{
  private String namaToko;
  private ArrayList<Daging> daftarDaging;

   public void setNamaToko(String namaToko){
    this.namaToko = namaToko;
  }

  public String getNamaToko(){
    return this.namaToko;
  }

  public void setDaftarDaging(ArrayList<Daging> daftarDaging){
    this.daftarDaging = daftarDaging;
  }

  public ArrayList<Daging> getDaftarDaging(){
    return this.daftarDaging;
  }

}