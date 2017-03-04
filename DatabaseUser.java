/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */

public class DatabaseUser
{
    // instance variables - replace the example below with your own
    private static Pelanggan pelanggan_database;
    private static Ojek ojek_database;
    private static int id_ojek_terakhir = 1;
    private static int id_pelanggan_terakhir = 1;

    /**
     *
     */
    public static boolean addPelanggan(Pelanggan baru)
    {
        pelanggan_database=baru;
        System.out.println("Pelanggan berhasil ditambahkan");
        return true;
    }
    
    /**
     *
     */
    public static boolean removePelanggan(int id)
    {
        pelanggan_database=null;
        return true;
    }
    
    /**
     *
     */
    public static boolean addOjek(Ojek baru) 
    {
        ojek_database=baru;
        System.out.println("Ojek berhasil ditambahkan");
        return true;
    }
    
    /**
     *
     */
    public static boolean removeOjek(int id)
    {
        ojek_database=null;
        return true;
    }
    
    public static int getIDOjekTerakhir()
    {
        return id_ojek_terakhir;
    }
    
    public static int getIDPelangganTerakhir()
    {
        return id_pelanggan_terakhir;
    }
    
    public static Ojek getUserOjek(int id)
    {
        return ojek_database;
    }
    
    public static Pelanggan getUserPelanggan()
    {
        return pelanggan_database;
    }
    
 
    
}
