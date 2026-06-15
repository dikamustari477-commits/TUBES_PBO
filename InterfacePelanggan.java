package tubes_pbo;

/**
 * Interface untuk mendefinisikan fitur yang wajib dimiliki oleh role Pelanggan.
 */
public interface InterfacePelanggan {
    void tampilkanData();
    void tambahPesanan(String namaPesanan, String detailPesanan);
    void tampilkanPembayaran();
}
