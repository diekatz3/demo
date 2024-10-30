/**
 * Kelas MainApp digunakan untuk menjalankan aplikasi kasir
 * dengan contoh transaksi.
 */
public class main{
    /**
     * Metode utama yang mengeksekusi program untuk menampilkan
     * detail transaksi.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Kasir transaksi1 = new Kasir("Budi", "Laptop", 2, 5000000);
        transaksi1.tampilkanTransaksi();
    }
}
