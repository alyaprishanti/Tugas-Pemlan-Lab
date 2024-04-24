package Inheritance;

import java.time.LocalDate;

class Manager extends Pekerja{
    private String departemen;

    //constructor
    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen){
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    //setter
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    //getter
    public String getDepartemen() {
        return departemen;
    }

    //tunjangan tambahan
    public double getTunjanganTambahan() {
        return 0.10 * getGaji();
    }

    //gaji total
    public double getGajiTotal(){
        return super.getGajiTotal() + getTunjanganTambahan();
    }

    //toString
    public String toString(){
        return super.toString() + "\nDepartemen: " + departemen;
    }

}
