import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Meminta pengguna memasukkan dua angka
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            // Meminta pengguna memilih operasi
            System.out.println("Pilih operasi: ");
            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (*)");
            System.out.println("4. Bagi (/)");
            System.out.print("Masukkan nomor operasi: ");
            int operasi = scanner.nextInt();

            // Melakukan operasi sesuai pilihan pengguna
            double hasil = 0;
            switch (operasi) {
                case 1:
                    hasil = angka1 + angka2;
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    break;
                case 4:
                    // Menangani kasus pembagian dengan nol
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Pilihan operasi tidak valid.");
                    return;
            }

            // Menampilkan hasil operasi
            System.out.println("Hasil: " + hasil);

        } catch (InputMismatchException e) {
            // Menangani exception jika pengguna memasukkan tipe data yang tidak sesuai
            System.out.println("Error: Masukan tidak sesuai dengan tipe data yang diharapkan.");
        } catch (Exception e) {
            // Menangani exception umum
            System.out.println("Error: Terjadi kesalahan dalam program.");
        }
    }
}

