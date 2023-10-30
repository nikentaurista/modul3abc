// File: Mobil.java

/**
 * Kelas yang mempersentasikan mobil
 */
public class Mobil {
    // Atribut
    private String merk;
    private String model;
    private int tahunProduksi;
    private double harga;

    /**
     * Konstruktor
     * @param merk
     * @param model
     * @param tahunProduksi
     * @param harga
     */

    public Mobil(String merk, String model, int tahunProduksi, double harga) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    /**
     * Metode untuk menampilkan informasi mobil
     */
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: $" + harga);
    }

    /**
     * Metode untuk menghitung umur mobil
     * @return
     */
    public int hitungUmur() {
        int tahunSekarang = java.time.Year.now().getValue();
        return tahunSekarang - tahunProduksi;
    }

    /**
     * Metode untuk mengupdate harga mobil
     * @param persentasePenaikan
     */
    public void updateHarga(double persentasePenaikan) {
        harga = harga * (1 + persentasePenaikan / 100);
        System.out.println("Harga setelah update: $" + harga);
    }
}
