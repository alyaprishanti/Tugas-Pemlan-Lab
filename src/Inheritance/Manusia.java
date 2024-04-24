package Inheritance;

class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    //constructor
    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    //getter
    public String getNama() {
        return nama;
    }
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public String getNik() {
        return nik;
    }
    public boolean getMenikah() {
        return menikah;
    }

    //tunjangan
    public double getTunjangan(){
        if(menikah){
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    //pendapatan
    public double getPendapatan(){
        return getTunjangan();
    }

    //toString
    public String toString(){
        return "Nama: " + nama + "\nNIK: " + nik + "\nJenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\nPendapatan: " + getPendapatan() + " $";
    }
}
