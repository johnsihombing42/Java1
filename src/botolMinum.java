class Botol {
    String harga="Rp.50.000"; //deklarasi instance variable
    String volume="300 Ml";   //deklarasi instance variable
    static String bahan="Plastik"; //deklarasi class variable

    void Penuh(){
        String harga="100.000"; //deklarasi local variable
        System.out.println("Botol dalam keadaan penuh");
        //akses local variable;
        System.out.println(harga);
    }
}

public class botolMinum{
    public static void main(String[] args) {

        Botol Botol1 = new Botol();
        //akses instance variable
        System.out.println("Harga  : "+Botol1.harga);
        System.out.println("Volume : "+Botol1.volume);

        //jalankan method penuh
        Botol1.Penuh();

        //Akses Class Variabel
        System.out.println("Bahan :"+ Botol1.bahan);

    }
}
