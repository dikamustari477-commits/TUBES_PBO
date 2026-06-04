package tubes_pbo;

public class ModelPelanggan {
    private String nama;
    private String noHp;
    private String alamat;
    private String statusPesanan;   
    private String statusPembayaran; 

    // Constructor 
    public ModelPelanggan(String nama, String noHp, String alamat) {
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
        this.statusPesanan = "Pending";     
        this.statusPembayaran = "Belum Bayar"; 
    }

    // Getter
    public String getNama() { return nama; }
    public String getNoHp() { return noHp; }
    public String getAlamat() { return alamat; }
    public String getStatusPesanan() { return statusPesanan; }
    public String getStatusPembayaran() { return statusPembayaran; }

    // Setter 
    public void setStatusPesanan(String statusPesanan) { this.statusPesanan = statusPesanan; }
    public void setStatusPembayaran(String statusPembayaran) { this.statusPembayaran = statusPembayaran; }
}
