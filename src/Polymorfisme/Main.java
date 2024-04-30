package Polymorfisme;

public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("Cheesecake", 20000, 1.5);
        kueArray[1] = new KuePesanan("Blackforest", 25000, 2);
        kueArray[2] = new KueJadi("Tart", 30000, 4);
        kueArray[3] = new KueJadi("Brownies", 15000, 5);
        kueArray[4] = new KuePesanan("Donat", 10000, 3);
        kueArray[5] = new KueJadi("Lapis Legit", 50000, 2);
        kueArray[6] = new KuePesanan("Rainbow Cake", 35000, 1.8);
        kueArray[7] = new KueJadi("Pudding", 10000, 6);
        kueArray[8] = new KuePesanan("Cupcake", 12000, 2.5);
        kueArray[9] = new KuePesanan("Eclairs", 12000, 1.2);
        kueArray[10] = new KueJadi("Pancake", 10000, 8);
        kueArray[11] = new KuePesanan("Muffin", 14000, 3.5);
        kueArray[12] = new KueJadi("Chiffon Cake", 40000, 3);
        kueArray[13] = new KuePesanan("Croissant", 18000, 2);
        kueArray[14] = new KuePesanan("Strudel", 30000, 1.5);
        kueArray[15] = new KueJadi("Red Velvet Cake", 45000, 2.5);
        kueArray[16] = new KueJadi("Fruit Cake", 55000, 3.5);
        kueArray[17] = new KuePesanan("Macarons", 20000, 1);
        kueArray[18] = new KuePesanan("Opera Cake", 28000, 2);
        kueArray[19] = new KueJadi("Sponge Cake", 38000, 4);

        //menampilkan data kue
        for (int i = 0; i < kueArray.length; i++) {
            Kue kue = kueArray[i];
            String jenisKue = (kue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            System.out.println(kue.toString() + "\nJenis Kue\t: " + jenisKue + "\n");
        }

        //menghitung total harga kue
        double totalHarga = 0;
        for (int i = 0; i < kueArray.length; i++) {
            totalHarga += kueArray[i].hitungHarga();
        }
        System.out.println("=====================================[S T A T S]=====================================");
        System.out.println("TOTAL HARGA SEMUA KUE\t: Rp " + totalHarga + "\n");

        //menghitung total harga dan berat kue pesanan
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (int i = 0; i < kueArray.length; i++) {
            if (kueArray[i] instanceof KuePesanan) {
                totalHargaKuePesanan += kueArray[i].hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kueArray[i]).berat;
            }
        }
        System.out.println("TOTAL HARGA KUE PESANAN\t: Rp " + totalHargaKuePesanan);
        System.out.println("TOTAL BERAT KUE PESANAN\t: " + totalBeratKuePesanan + " gram");

        //menghitung total harga dan jumlah kue jadi
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for(int i = 0; i < kueArray.length; i++) {
            if (kueArray[i] instanceof KueJadi) {
                totalHargaKueJadi += kueArray[i].hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kueArray[i]).jumlah;
            }
        }
        System.out.println("\nTOTAL HARGA KUE JADI\t: Rp " + totalHargaKueJadi);
        System.out.println("TOTAL JUMLAH KUE JADI\t: " + totalJumlahKueJadi + " buah");

        //kue dengan harga termahal
        System.out.println("\nKUE DENGAN HARGA TERMAHAL");
        //berdasarkan nama kue
        Kue kueTermahal = kueArray[0];
        for (int i = 1; i < kueArray.length; i++) {
            if (kueArray[i].hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kueArray[i];
            }
        }
        System.out.println("\tBerdasarkan Nama Kue\t:" + kueTermahal.nama);
        //berdasarkan jenis
        String jenisKue = (totalHargaKuePesanan > totalHargaKueJadi) ? "Kue Pesanan" : "Kue Jadi";
        System.out.println("\tBerdasarkan Jenis Kue\t: " + jenisKue);
    }    
}
