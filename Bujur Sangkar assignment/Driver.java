public class Driver {
    public static void main(String[] args) {
        Bentuk bentuk = new Bentuk();
        bentuk.setWarna("Merah");
        bentuk.printInfo();

        BujurSangkar bujungSangkar = new BujurSangkar(10, "Hijau");
        bujungSangkar.setSisi(5);
        bujungSangkar.setWarna("Purple");
        bujungSangkar.printInfo();
        bujungSangkar.hitungLuas();
        
        Lingkaran lingkaran = new Lingkaran(7, "Biru");
        lingkaran.setRadius(24);
        lingkaran.getRadius();
        lingkaran.hitungLuas();
        lingkaran.printInfo();

        Silinder silinder = new Silinder(10, 10, "Pink");
        silinder.getTinggi();
        silinder.setTinggi(4);
        silinder.hitungVolume();
        silinder.printInfo();
    }
}
