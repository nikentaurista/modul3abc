// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", "Camry", 2020, 25000.0);

        // Menampilkan informasi mobil
        mobil1.tampilkanInfo();

        // Menampilkan umur mobil
        System.out.println("Umur mobil: " + mobil1.hitungUmur() + " tahun");

        // Mengupdate harga mobil
        mobil1.updateHarga(5);
    }
}
