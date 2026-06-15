package tubes_pbo;

public class ModelPesanan {
    private int id;
    private int userId;
    private String namaPesanan;
    private String detailPesanan;
    private String statusPesanan;
    private int totalHarga;
    private String statusPembayaran;

    public ModelPesanan(String namaPesanan, String detailPesanan) {
        this(0, 0, namaPesanan, detailPesanan, "Pending", 0, "Belum Bayar");
    }

    public ModelPesanan(int id, int userId, String namaPesanan, String detailPesanan,
                        String statusPesanan, int totalHarga, String statusPembayaran) {
        this.id = id;
        this.userId = userId;
        this.namaPesanan = namaPesanan;
        this.detailPesanan = detailPesanan;
        this.statusPesanan = statusPesanan;
        this.totalHarga = totalHarga;
        this.statusPembayaran = statusPembayaran;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getNamaPesanan() { return namaPesanan; }
    public void setNamaPesanan(String namaPesanan) { this.namaPesanan = namaPesanan; }

    public String getDetailPesanan() { return detailPesanan; }
    public void setDetailPesanan(String detailPesanan) { this.detailPesanan = detailPesanan; }

    public String getStatusPesanan() { return statusPesanan; }
    public void setStatusPesanan(String statusPesanan) { this.statusPesanan = statusPesanan; }

    public int getTotalHarga() { return totalHarga; }
    public void setTotalHarga(int totalHarga) { this.totalHarga = totalHarga; }

    public String getStatusPembayaran() { return statusPembayaran; }
    public void setStatusPembayaran(String statusPembayaran) { this.statusPembayaran = statusPembayaran; }
}
