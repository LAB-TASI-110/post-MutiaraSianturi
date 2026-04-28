package model;

public class Model2 {
    public String kode;
    public String tujuan;
    public int berat;
    public String status;

    public Model2(String kode, String tujuan, int berat) {
        this.kode = kode;
        this.tujuan = tujuan;
        this.berat = berat;
        this.status = "PROSES";
    }
}
