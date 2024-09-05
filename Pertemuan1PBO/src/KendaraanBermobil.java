public class KendaraanBermobil {
    // Deskriptor-1: Properti
    // Berupa kata benda
    // Sesuatu yang dimiliki oleh class
    private String merkMbl;
    private int tahunPembuatanMbl;

    // Deskriptor-2: Method
    // Berupa kata kerja
    // Sesuatu yang bisa DILAKUKAN oleh class
    public void nyalakanMbl()
    {
        System.out.println("FROOMMMMM!");
    }

    public void jalankanMbl() {
        System.out.println("STUTUTUTUUUUU! Kendaraan Bermobil " + this.merkMbl +
                " sudah berjalan di jalan raya");
    }

    // Konstruktor
    public KendaraanBermobil(String merkMbl, int tahunPembuatanMbl) {
        this.merkMbl = merkMbl;
        this.tahunPembuatanMbl = tahunPembuatanMbl;
    }
}
