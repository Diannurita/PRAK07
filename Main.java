package com.company;

public class Main {

    public static void main(String[] args) {


	Pegawai pegawai1 = new sales("Tika", "350728490327424892344", 50, 50000);
    Pegawai pegawai2 = new sales("Diandra", "263547283746585463728", 55, 55000);
    Pegawai pegawai3 = new sales("Agam", "8764654674345678965", 40, 40000);
    Pegawai pegawai4 = new sales("Baykal", "87673645627846253965", 60, 45000);
    Pegawai pegawaiharian1 = new pegawaiHarian("Edo", "350728490327424892343", 8500, 40);
    Pegawai pegawaiharian2 = new pegawaiHarian("Lutfi", "456765387965345765434", 6500, 35);
    Pegawai pegawaiharian3 = new pegawaiHarian("Imam", "897654367587436598234", 9000, 50);
    Pegawai pegawaiharian4 = new pegawaiHarian("Deksa", "897635243748373535374", 10000, 55);
    Pegawai pegawaitetap1 = new pegawaiTetap("Bayu", "350728490327424892342", 2000000);
    Pegawai pegawaitetap2 = new pegawaiTetap("Adinda", "3456786543235676334876", 3500000);
    Pegawai pegawaitetap3 = new pegawaiTetap("Alicia", "765789543678954357654", 2750000);
    Pegawai pegawaitetap4 = new pegawaiTetap("Bima", "354252849272537484653", 275000);
    System.out.println("\t\t======PEGAWAI TETAP======\t");
    System.out.println(pegawaitetap1);
    System.out.println(pegawaitetap2);
    System.out.println(pegawaitetap3);
    System.out.println(pegawaitetap4);
    System.out.println("\t\t======PEGAWAI HARIAN======\t");
    System.out.println(pegawaiharian1);
    System.out.println(pegawaiharian2);
    System.out.println(pegawaiharian3);
    System.out.println(pegawaiharian4);
    System.out.println("\t\t======SALES======\t");
    System.out.println(pegawai1);
    System.out.println(pegawai2);
    System.out.println(pegawai3);
    System.out.println(pegawai4);
    }
}
