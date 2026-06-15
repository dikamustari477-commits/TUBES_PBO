package tubes_pbo;

public class ModelPenjahit extends Pengguna {
    private int id;
    private String alamat;
    private String password;

    public ModelPenjahit(String nama, String noHp, String alamat, String password) {
        super(nama, noHp);
        this.alamat = alamat;
        this.password = password;
    }

    public ModelPenjahit(int id, String nama, String noHp, String alamat, String password) {
        super(nama, noHp);
        this.id = id;
        this.alamat = alamat;
        this.password = password;
    }

    @Override
    public String getRole() {
        return "Penjahit";
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
}