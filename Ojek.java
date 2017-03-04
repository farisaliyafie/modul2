/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class Ojek
{
    // instance variables - replace the example below with your own
    private static String status = "Idle";
    private static Lokasi posisi_sekarang;
    private static Pesanan pesanan_sekarang = null;
    private static int id;
    private static String nama;

    /**
     * Konstruktor kelas ojek
     * @param   id              no identitas pengemudi
     * @param   nama            nama pengemudi
     * @param   posisi_sekarang lokasi pengemudi sekarang
     * @return  none            nothing
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang)
    {
        this.id=id;
        this.nama=nama;
        this.posisi_sekarang=posisi_sekarang;
    }

    /**
     * Setter identitas pengemudi
     * @param   id      nilai id yang di set
     * @retun   none    nothing
     */
    public void setID(int id)
    {
        this.id=id;
    }
    
    /**
     * Setter nama pengemudi
     * @param   nama    nama pengemudi yand di set
     * @retun   none    nothing
     */
    public void setNama (String nama)
    {
        this.nama=nama;
    }
    
    /**
     * Setter pesanan u/ pengemudi
     * @param   pesan   objek pesanan yang di set
     * @return  none    nothing
     */
    public void setPesanan (Pesanan pesan)
    {
        pesanan_sekarang=pesan;
    }
    
    /**
     * Setter lokasi sekarang pengemudi
     * @param   sekarang    objek lokasi u/ informasi posisi
     * @return  none        nothing
     */
    public void setPosisi (Lokasi sekarang)
    {
        posisi_sekarang=sekarang;
    }
    
    /**
     * Setter status pengemudi
     * @param   status  status pengemudi
     * @return  none    nothing
     */
    public void setStatus (String status)
    {
        this.status=status;
    }
    
    /**
     * Getter identitas pengemudi
     * @param   none    nothing
     * @return  id      mengembalikan nilai no identitas
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Getter nama u/ pengemudi
     * @param   none    nothing
     * @return  nama    mengembalikan nama pengemudi
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Getter pesanan untuk pengemudi
     * @param   none                nothing
     * @return  pesanan_sekarang    mengembalikan nilai objek pesanan
     */
    public Pesanan getPesanan()
    {
        return pesanan_sekarang;
    }
    
    /**
     * Getter lokasi sekarang pengemudi
     * @param   none            nothing
     * @return  posisi_sekarang mengembalikan objek lokasi posisi sekarang
     */
    public Lokasi getPosisi()
    {
        return posisi_sekarang;
    }
    
    /**
     * Getter status dari pengemudi
     * @param   none    nothing
     * @return  status  mengembalikan kondisi status pengemudi
     */
    public String getStatus()
    {
        return status;
    }
    
    /**
     * Cetak informasi identitas, nama dan statusnya
     * @param   none    nothing
     * @return  none 
     */
    public void printData()
    {
        System.out.println("ID Ojek : " + this.id);
        System.out.println("Nama : " + this.nama);
        System.out.println("Status : " + this.status);
    }
}
