package Inheritance;

class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    //constructor
    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk){
        super(nama, jenisKelamin, nik, menikah);
        this.nim =nim;
        this.ipk = ipk;
    }

    //setter
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    //getter
    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }

    //status
    public String getStatus(){
        String[] prodi = {"Teknik Informatika", "Teknik Komputer", "Sistem Informasi", "Pendidikan Teknologi Informasi", "Teknologi Informasi"};
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int kodeProdi = Integer.parseInt(nim.substring(6, 7));
        String prodiString = prodi[kodeProdi -2];
        return prodiString + ", 20" + angkatan;
    }

    //beasiswa
    public double getBeasiswa(){
        if (ipk >= 3.5 && ipk <= 4.0){
            return 75;
        } else if (ipk >= 3.0 && ipk < 3.5){
            return 50;
        } else {
            return 0;
        }
    }

    //pendapatan
    public double getPendapatan(){
        return super.getPendapatan() + getBeasiswa();
    }

    //toString
    public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nIPK: " + ipk + "\nStatus: " + getStatus();
    }
}
