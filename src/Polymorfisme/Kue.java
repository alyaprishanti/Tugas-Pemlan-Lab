package Polymorfisme;

abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();
    public String toString() {
        return "Nama Kue\t: " + nama + "\nHarga\t\t: Rp" + hitungHarga();
    }
}