/**
 * Kelas Kasir merepresentasikan transaksi di kasir,
 * termasuk perhitungan total harga dan diskon.
 */
public class Kasir {
    private String namaPelanggan;
    private String namaBarang;
    private int jumlahBarang;
    private double hargaSatuan;
    private final double diskon = 0.10;

    /**
     * Konstruktor untuk membuat objek Kasir dengan data transaksi tertentu.
     *
     * @param namaPelanggan nama pelanggan yang melakukan transaksi
     * @param namaBarang nama barang yang dibeli
     * @param jumlahBarang jumlah barang yang dibeli
     * @param hargaSatuan harga satuan dari barang
     */
    public Kasir(String namaPelanggan, String namaBarang, int jumlahBarang, double hargaSatuan) {
        this.setNamaPelanggan(namaPelanggan);
        this.setNamaBarang(namaBarang);
        this.setJumlahBarang(jumlahBarang);
        this.setHargaSatuan(hargaSatuan);
    }

    /**
     * Menghitung total harga setelah diskon.
     *
     * @return total harga setelah diskon
     */
    public double hitungTotal() {
        double totalHarga = getJumlahBarang() * getHargaSatuan();
        double totalDiskon = totalHarga * getDiskon();
        double hargaSetelahDiskon = totalHarga - totalDiskon;
        return hargaSetelahDiskon;
    }

    /**
     * Menghitung jumlah diskon yang diberikan.
     *
     * @return jumlah diskon
     */
    public double hitungDiskon() {
        double totalHarga = getJumlahBarang() * getHargaSatuan();
        double totalDiskon = getTotalDiskon(totalHarga);
        return totalDiskon;
    }

    /**
     * Menghitung diskon berdasarkan total harga.
     *
     * @param totalHarga total harga sebelum diskon
     * @return total diskon
     */
    private double getTotalDiskon(double totalHarga) {
        double totalDiskon = totalHarga * getDiskon();
        return totalDiskon;
    }

    /**
     * Menampilkan informasi transaksi, termasuk detail barang, diskon, dan total harga.
     */
    public void tampilkanTransaksi() {
        System.out.println("Nama Pelanggan: " + getNamaPelanggan());
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Jumlah Barang: " + getJumlahBarang());
        System.out.println("Harga Satuan: " + getHargaSatuan());
        System.out.println("Diskon: " + (getDiskon() * 100) + "%");
        System.out.println("Total Harga: " + hitungTotal());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }

    /**
     * Mendapatkan nama pelanggan.
     *
     * @return nama pelanggan
     */
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    /**
     * Menetapkan nama pelanggan.
     *
     * @param namaPelanggan nama pelanggan yang akan diset
     */
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    /**
     * Mendapatkan nama barang.
     *
     * @return nama barang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * Menetapkan nama barang.
     *
     * @param namaBarang nama barang yang akan diset
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * Mendapatkan jumlah barang.
     *
     * @return jumlah barang
     */
    public int getJumlahBarang() {
        return jumlahBarang;
    }

    /**
     * Menetapkan jumlah barang.
     *
     * @param jumlahBarang jumlah barang yang akan diset
     */
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    /**
     * Mendapatkan harga satuan barang.
     *
     * @return harga satuan
     */
    public double getHargaSatuan() {
        return hargaSatuan;
    }

    /**
     * Menetapkan harga satuan barang.
     *
     * @param hargaSatuan harga satuan yang akan diset
     */
    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    /**
     * Mendapatkan persentase diskon.
     *
     * @return persentase diskon
     */
    public double getDiskon() {
        return diskon;
    }
}
