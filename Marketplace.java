import java.util.ArrayList;
public class Marketplace{
  private String namaMarketPlace;
  private ArrayList<Toko> daftarToko;

  public void setNamaMarketPlace(String namaMarketPlace){
    this.namaMarketPlace = namaMarketPlace;
  }

  public String getNamaMarketPlace(){
    return this.namaMarketPlace;
  }

  public void setDaftarToko(ArrayList<Toko> daftarToko){
    this.daftarToko = daftarToko;
  }

  public ArrayList<Toko> getDaftarToko(){
    return this.daftarToko;
  }
}