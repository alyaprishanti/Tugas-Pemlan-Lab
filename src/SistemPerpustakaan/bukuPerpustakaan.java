package SistemPerpustakaan;

public class BukuPerpustakaan { 
    private int choiceNumber;
    private String[][] teknologi;
    private String[][] filsafat;
    private String[][] sejarah;
    private String[][] agama;
    private String[][] psikologi;
    private String[][] politik;
    private String[][] fiksi;
    
    public BukuPerpustakaan (String[][] teknologi, String[][] filsafat, String[][] sejarah,
    String[][] agama, String[][] psikologi, String[][] politik, String[][] fiksi, int choiceNumber) {
        this.teknologi = teknologi;
        this.filsafat = filsafat;
        this.sejarah = sejarah;
        this.agama = agama;
        this.psikologi = psikologi;
        this.politik = politik;
        this.fiksi = fiksi;
        this.choiceNumber = choiceNumber;
    }

    public void displayBuku(String[][] kategori, String kategoriNama) {
        System.out.println("===== Buku Kategori " + kategoriNama + " =====" + "\n");
        int nomorBuku = 1;
        for (String[] buku : kategori) {
            System.out.println("Buku ke-" + nomorBuku);
            System.out.println("1. Judul          : " + buku[0]);
            System.out.println("2. Penulis        : " + buku[1]);
            System.out.println("3. Jumlah halaman : " + buku[2]);
            System.out.println("4. Tahun terbit   : " + buku[3]);
            System.out.println("5. Penerbit       : " + buku[4]);
            System.out.println("6. Sinopsis       : " + buku[5]);
            int jumlahKataSinopsis = wordCount(buku[5]);
            System.out.println("Jumlah kata sinopsis: " + jumlahKataSinopsis);
            System.out.println("");
            nomorBuku++;
        }
    }
    //method menghitung jumlah kata 
    public int wordCount(String sinopsis) {
        String[] kataKata = sinopsis.split("\\s+");
        return kataKata.length;
    }
    public void displaySemuaBuku() {
        displayBuku(teknologi, "Teknologi");
        displayBuku(filsafat, "Filsafat");
        displayBuku(sejarah, "Sejarah");
        displayBuku(agama, "Agama");
        displayBuku(psikologi, "Psikologi");
        displayBuku(politik, "Politik");
        displayBuku(fiksi, "Fiksi");
    }
    public void pilihan() {
        boolean out = true;
        do {
            if (choiceNumber == 1){
                displayBuku(teknologi, "Teknologi");
                break;
            } else if(choiceNumber == 2){
                displayBuku(filsafat, "Filsafat");
                break;
            } else if(choiceNumber == 3){
                displayBuku(sejarah, "Sejarah");
                break;
            } else if(choiceNumber == 4){
                displayBuku(agama, "Agama");
                break;
            } else if(choiceNumber == 5){
                displayBuku(psikologi, "Psikologi");
                break;
            }else if(choiceNumber == 6){
                displayBuku(politik, "Politik");
                break;
            }else if(choiceNumber == 7){
                displayBuku(fiksi, "Fiksi");
                break;
            }else if(choiceNumber == 8){
                displaySemuaBuku();
                break;
            }else if(choiceNumber == 9){
                out = false;
                System.out.println("Terima kasih sudah mengunjungi perpustakaan kami! Silakan berkunjung kembali :)");
                break;
            } else {
                System.out.println("Input tidak valid. Silakan coba lagi.");
                break;
            }
        } while (out);
    }
}