package tubes_pbo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public abstract class Pengguna {
    
    protected String nama;
    protected String noHp;

    public Pengguna(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public abstract String getRole();
}