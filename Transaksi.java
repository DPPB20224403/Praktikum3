public class Transaksi{
  private Daging daging;
  private int kgBeli;
  private double totalBayar;

  public void setDaging(Daging daging){
    this.daging = daging;
  }

  public Daging getDaging(){
    return this.daging;
  }

  public void setKgBeli(int kgBeli){
    this.kgBeli = kgBeli;
  }

  public int getKgBeli(){
    return this.kgBeli;
  }

  public void setTotalBayar(double totalBayar){
    this.totalBayar = totalBayar;
  }

  public double getTotalBayar(){
    return this.daging.getHargaDaging() * this.kgBeli;
  }
}