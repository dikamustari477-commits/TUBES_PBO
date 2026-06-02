package tubes_pbo;

public class ModelPelanggan {
    private String nama;
    private String noHp;
    private String alamat;
    private String statusPesanan;   
    private String statusPembayaran; 
    private int totalHarga;

    // Constructor 
    public ModelPelanggan(String nama, String noHp, String alamat) {
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
        this.statusPesanan = "Pending";     
        this.statusPembayaran = "Belum Bayar"; 
        this.totalHarga = 0;
    }

    // Getter
    public String getNama() { return nama; }
    public String getNoHp() { return noHp; }
    public String getAlamat() { return alamat; }
    public String getStatusPesanan() { return statusPesanan; }
    public String getStatusPembayaran() { return statusPembayaran; }
    public int getTotalHarga() { return totalHarga; }

    // Setter 
    public void setStatusPesanan(String statusPesanan) { this.statusPesanan = statusPesanan; }
    public void setStatusPembayaran(String statusPembayaran) { this.statusPembayaran = statusPembayaran; }
    public void setTotalHarga(int totalHarga) { this.totalHarga = totalHarga; }
}
