package tubes_pbo;

public class ModelPenjahit {
    private String nama;
    private String noHp;
    private String alamat;

    public ModelPenjahit(String nama, String noHp, String alamat) {
        this.nama   = nama;
        this.noHp   = noHp;
        this.alamat = alamat;
    }

    public String getNama()     { return nama; }
    public String getNoHp()     { return noHp; }
    public String getAlamat()   { return alamat; }
}
