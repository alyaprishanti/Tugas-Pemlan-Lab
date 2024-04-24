package Inheritance;

import java.time.LocalDate;

class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    //constructor
    public Pekerja (String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak){
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    //setter
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    //getter
    public double getGaji() {
        return gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    //bonus
    public double getBonus(){
        int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaKerja <= 5){
            return 0.05 * gaji;
        } else if (lamaKerja <= 10){
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    //gaji total
    public double getGajiTotal(){
        return gaji + getBonus() + (jumlahAnak * 20);
    }

    //pendapatan
    public double getPendapatan(){
        return super.getPendapatan() + getGajiTotal();
    }

    //toString
    public String toString(){
        return super.toString() + "\nTahun Masuk: " + tahunMasuk.getDayOfMonth()+ " " + tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() + "\nJumlah Anak: " + jumlahAnak + "\nGaji: " + gaji;
    }

}
