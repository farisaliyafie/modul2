/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class OjeKampus
{
    public void main(String[] args) {
       Lokasi lokasi1=new Lokasi("perum",14,06,"Rawalumbu");
       Lokasi per_yafie_awal=new Lokasi("Kampus UI",5,7,"Depok");
       Lokasi per_yafie_akhir=new Lokasi("Kukusan",5,7,"Depok");
       Ojek ojek_farisali=new Ojek(DatabaseUser.getIDOjekTerakhir(),
                                    "farisali",lokasi1);
       Pelanggan p_yafie=new Pelanggan(DatabaseUser.getIDPelangganTerakhir(),
                                        "yafie");
       Pesanan pes_yafie=new Pesanan(p_yafie,"SUPER",per_yafie_awal,
                                       per_yafie_akhir,"aya","aye",100);
       DatabaseUser db_us1=new DatabaseUser();
       DatabasePesanan db_pl1=new DatabasePesanan();
       
       db_us1.addPelanggan(p_yafie);
       db_us1.addOjek(ojek_farisali);
       db_pl1.addPesanan(pes_yafie);
       
       System.out.println("\n Ojek : ");
       ojek_farisali.printData();
       System.out.println("\n Pelanggan : ");
       p_yafie.printData();
       
       ojek_farisali.setNama("yafie");
       p_yafie.setNama("farisali");
       
       System.out.println("\n Ojek : ");
       ojek_farisali.printData();
       System.out.println("\n Pelanggan : ");
       p_yafie.printData();
       
       pes_yafie.printData();
    }
}
