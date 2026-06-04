package tubes_pbo;

public class ModelPelanggan {
    private String nama;
    private String noHp;
    private String alamat;
    private String password: 
    private String statusPesanan;   
    private String statusPembayaran; 

    // Cons
    public ModelPelanggan(String nama, String noHp, String alamat, String password) {
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
        this.password = password;
        this.statusPesanan = "Pending";     
        this.statusPembayaran = "Belum Bayar"; 
    }

    // Get
    public String getNama() { return nama; }
    public String getNoHp() { return noHp; }
    public String getAlamat() { return alamat; }
    public String getPassword() { return password; }
    public String getStatusPesanan() { return statusPesanan; }
    public String getStatusPembayaran() { return statusPembayaran; }

    // Set
    public void setStatusPesanan(String statusPesanan) { this.statusPesanan = statusPesanan; }
    public void setStatusPembayaran(String statusPembayaran) { this.statusPembayaran = statusPembayaran; }
}
