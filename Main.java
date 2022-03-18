import java.util.ArrayList;
import java.util.Scanner;

class Main {

  static Toko pilihanToko;
  public static void main(String[] args) {
    Marketplace tokoDagingPedia = new Marketplace();
    tokoDagingPedia.setNamaMarketPlace("Toko DagingPedia");
    
    Daging A1a = new Daging();
    A1a.setJenisDaging("A1");
    A1a.setHargaDaging(100000.00);

    Daging A2a = new Daging();
    A2a.setJenisDaging("A2");
    A2a.setHargaDaging(200000.00);

    Daging A3a = new Daging();
    A3a.setJenisDaging("A3");
    A3a.setHargaDaging(350000.00);

    Daging A4a = new Daging();
    A4a.setJenisDaging("A4");
    A4a.setHargaDaging(500000.00);

    Daging A5a = new Daging();
    A5a.setJenisDaging("A5");
    A5a.setHargaDaging(1000000.00);

    Toko A = new Toko();
    A.setNamaToko("Toko A");
    
    ArrayList<Daging> daftarDaging = new ArrayList();
    daftarDaging.add(A1a);
    daftarDaging.add(A2a);
    daftarDaging.add(A3a);
    daftarDaging.add(A4a);
    daftarDaging.add(A5a);
    A.setDaftarDaging(daftarDaging);

    Daging A1b = new Daging();
    A1b.setJenisDaging("A1");
    A1b.setHargaDaging(150000.00);

    Daging A2b = new Daging();
    A2b.setJenisDaging("A2");
    A2b.setHargaDaging(250000.00);

    Daging A3b = new Daging();
    A3b.setJenisDaging("A3");
    A3b.setHargaDaging(375000.00);

    Daging A4b = new Daging();
    A4b.setJenisDaging("A4");
    A4b.setHargaDaging(600000.00);

    Daging A5b = new Daging();
    A5b.setJenisDaging("A5");
    A5b.setHargaDaging(1100000.00);

    Toko B = new Toko();
    B.setNamaToko("Toko B");
    
    ArrayList<Daging> daftarDagingB = new ArrayList();
    daftarDagingB.add(A1b);
    daftarDagingB.add(A2b);
    daftarDagingB.add(A3b);
    daftarDagingB.add(A4b);
    daftarDagingB.add(A5b);
    B.setDaftarDaging(daftarDagingB);

    ArrayList<Toko> daftarToko = new ArrayList<>();
    daftarToko.add(A);
    daftarToko.add(B);
    tokoDagingPedia.setDaftarToko(daftarToko);

    for(Toko toko: tokoDagingPedia.getDaftarToko()){
      System.out.println("Toko yang ada : " + toko.getNamaToko());
    }

    Scanner input = new Scanner(System.in);
    System.out.println("Masukan pilihan toko anda");
    int pilihan = input.nextInt();
    if(pilihan == 1)
      pilihanToko = tokoDagingPedia.getDaftarToko().get(0);
    else
      pilihanToko = tokoDagingPedia.getDaftarToko().get(1);

    for(Daging daging: pilihanToko.getDaftarDaging()){
      System.out.println("Daftar dan harga daging : " + daging.getJenisDaging() + " harga " + daging.getHargaDaging());
    }

    Transaksi trx = new Transaksi();
    System.out.println("Masukan pilihan daging anda");
    int pilihanDaging = input.nextInt();
    if(pilihanDaging == 1)
      trx.setDaging(pilihanToko.getDaftarDaging().get(0));
    if(pilihanDaging == 2)
      trx.setDaging(pilihanToko.getDaftarDaging().get(1));
    if(pilihanDaging == 3)
      trx.setDaging(pilihanToko.getDaftarDaging().get(2));
    if(pilihanDaging == 4)
      trx.setDaging(pilihanToko.getDaftarDaging().get(3));
    if(pilihanDaging == 5)
      trx.setDaging(pilihanToko.getDaftarDaging().get(4));
    
    System.out.println("Masukan kg beli daging anda");
    int pilihanKg = input.nextInt();
    trx.setKgBeli(pilihanKg);
    trx.setTotalBayar(trx.getDaging().getHargaDaging(), trx.getKgBeli());
    System.out.println(trx.getTotalBayar());

  }
}