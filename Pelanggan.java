
/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class Pelanggan
{
    private static int id;
    private static String nama;

    /**
     *Konstruktor kelas Pelanggan
     *@param    id      nomor identitas pelanggan
     *@param    nama    nama pelanggan
     *@return   retun   nothing
     */
    public Pelanggan(int id, String nama)
    {
        this.id=id;
        this.nama=nama;
    }

    /**
     *Getter indentitas pelanggan ojek
     *@param    none    nothing
     *@retun    id      mengembalikan nilai no identitas
     */
    public int getID()
    {
        return id;
    }
    
    /**
     *Getter nama pelanggan ojek
     *@param    none    nothing
     *@retun    nama      mengembalikan nama ojek
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     *Setter indentitas pelanggan ojek
     *@param    id      nilai id yang di set
     *@retun    none    nothing
     */
    public void setID(int id)
    {
        this.id=id;
    }
    
    /**
     *Setter nama pelanggan ojek
     *@param    nama    nama pengemudi yang di set
     *@retun    none    nothing
     */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    /**
     *Print informasi identitas dan nama pelanggan
     */
    public void printData()
    {
        System.out.println("ID Pelanggan : " + this.id);
        System.out.println("Nama : " + this.nama);
    }
}
