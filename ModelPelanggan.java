package tubes_pbo;

import java.util.ArrayList;

public class ModelPelanggan extends Pengguna {
    private int id;
    private String alamat;
    private String password;
    private ArrayList<ModelPesanan> listPesanan = new ArrayList<>();

    public ModelPelanggan(String nama, String noHp, String alamat, String password) {
        super(nama, noHp);
        this.alamat = alamat;
        this.password = password;
    }

    public ModelPelanggan(int id, String nama, String noHp, String alamat, String password) {
        super(nama, noHp);
        this.id = id;
        this.alamat = alamat;
        this.password = password;
    }

    @Override
    public String getRole() {
        return "Pelanggan";
    }

    public int getId() {
        return id;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<ModelPesanan> getListPesanan() {
        return listPesanan;
    }

    public void tambahPesanan(ModelPesanan pesanan) {
        listPesanan.add(pesanan);
    }
}