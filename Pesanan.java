/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private static Ojek pelayan=null;
    private static Pelanggan pengguna;
    private static String pelanggan_awal;
    private static String pelanggan_akhir;
    private static double biaya;
    private static String layanan;
    private static Lokasi lokasi_awal;
    private static Lokasi lokasi_akhir;
    private static boolean diproses = false;
    private static boolean dibatalkan = false;


    public Pesanan(Pelanggan pengguna, String layanan, Lokasi 
                   lokasi_awal, Lokasi lokasi_akhir, String
                   pelanggan_awal, String pelanggan_akhir, double biaya)
    {
        this.pengguna=pengguna;
        this.layanan=layanan;
        this.lokasi_awal=lokasi_awal;
        this.lokasi_akhir=lokasi_akhir;
        this.pelanggan_awal=pelanggan_awal;
        this.pelanggan_akhir=pelanggan_akhir;
        this.biaya=biaya;
    }

    public boolean getStatusPesanan()
    {
        return false;
    }
    
    public Pelanggan getPelanggan()
    {
        return pengguna;
    }
    
    public Ojek getOjek()
    {
        return pelayan;
    }

    public Lokasi getLokasiAwal()
    {
        return lokasi_awal;
    }
    
    public Lokasi getLokasiAkhir()
    {
        return lokasi_akhir;
    }
    
    public String getTipeLayanan()
    {
        return layanan;
    }
    
    public String getPenggunaAwal()
    {
        return pelanggan_awal;
    }
    
    public String getPenggunaAkhir()
    {
        return pelanggan_akhir;
    }
    
    public double getBiaya()
    {
        return biaya;
    }

    public void printData()
    {
        System.out.println("Lokasi awal : " + this.lokasi_awal.getNama());
        System.out.println("Lokasi akhir : " + this.lokasi_akhir.getNama());
        System.out.println("Tipe layanan : " + this.layanan);
    }
    
}
