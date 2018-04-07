package praktik03;
public class sepatuaksi {
    public static void main(String[] args) {
        sepatu s1 = new sepatu();
        
        s1.setMerk("Adidas");
        s1.setWarna("Putih");
        s1.setUkuran("22");
        s1.setHarga(400000);
        
        s1.cetakInfo();
        
        System.out.println("Merk Sepatu \t:  ");
        System.out.println(s1.getMerk());
        System.out.println("Warna Sepatu \t: ");
        System.out.println(s1.getWarna());
        System.out.println("Ukuran Sepatu \t: ");
        System.out.println(s1.getUkuran());
        System.out.println("Harga Sepatu \t:  ");
        System.out.println(s1.getHarga());
        
        sepatugunung sg = new sepatugunung();
        sg.setMerk("Consina");
        sg.setWarna("Biru");
        sg.setUkuran("21");
        sg.setHarga(8000000);
        sg.setJenissepatu("Hiking Boot");
        sg.cetakInfo();
        System.out.println("Jenis \t :"+sg.getJenissepatu());
        sg.throttle();
    }
    
    
}
