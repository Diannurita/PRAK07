package com.company;

public class pegawaiTetap extends Pegawai {
    private double upah;

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public pegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }
    public int gaji(){
        return (int)upah;
    }
    @Override
    public String toString() {
        return "Pegawai Tetap\t: " + getNama() + "\nNo.Ktp\t\t\t: " + getNoKTP() +
                "\nupah\t\t\t: " + upah + "\nPendapatan\t\t: Rp." + gaji() + "\n";
    }
}
