package SistemPerpustakaan;
public class bukuPerpustakaan {
    private int choiceNumber;
    private String[][] teknologi = {
        {"Web Programming", "Fitri Marisa", "259", "2017", "Deepublish"},
        {"Mobile App Development", "Arief Setiawan", "320", "2018", "Erlangga"},
        {"Data Science Basics", "Rina Pratiwi", "200", "2019", "Gramedia"},
        {"Cybersecurity Essentials", "Budi Santoso", "280", "2016", "Pustaka Abadi"},
        {"Artificial Intelligence", "Dewi Susanti", "350", "2022", "Kompas Media"}
    };
    private String[][] filsafat = {
        {"Meditasi Filsafat", "Budi Santoso", "180", "2015", "Pustaka Abadi"},
        {"Pemikiran Kritis", "Citra Dewi", "220", "2018", "Erlangga"},
        {"Etika Kontemporer", "Farhan Hidayat", "200", "2017", "Gramedia"},
        {"Pandangan Hidup", "Rahmat Wijaya", "240", "2019", "Penerbit XYZ"},
        {"Metafisika Modern", "Siti Rahayu", "190", "2016", "Novel Fantasi"}
    };
    private String[][] sejarah = {
        {"Sejarah Nusantara", "Budi Santoso", "200", "2015", "Pustaka Abadi"},
        {"Perang Dunia II", "Dewi Susanti", "300", "2012", "Kompas Media"},
        {"Runtuhnya Kerajaan Romawi", "Ahmad Ridwan", "250", "2018", "Gramedia"},
        {"Revolusi Industri", "Ratna Dewi", "180", "2020", "Erlangga"},
        {"Perang Vietnam", "Agus Setiawan", "220", "2016", "Penerbit XYZ"}
    };
    private String[][] agama = {
        {"Mengenal Agama", "Ahmad Budi", "150", "2015", "Pustaka Jaya"},
        {"Buku Agama Hindu", "Rudi Santoso", "180", "2017", "Gramedia"},
        {"Perjalanan Rohani", "Siti Rahmah", "200", "2018", "Media Kita"},
        {"Perjalanan Cinta Abadi", "Aulia Fitri", "220", "2016", "Erlangga"},
        {"Kisah-Kisah Surga", "Dewi Susanti", "250", "2019", "Penerbit XYZ"}
    };
    private String[][] psikologi = {
        {"The Power of Habit", "Charles Duhigg", "371", "2012", "Random House"},
        {"Thinking, Fast and Slow", "Daniel Kahneman", "499", "2011", "Farrar, Straus and Giroux"},
        {"Influence: The Psychology of Persuasion", "Robert B. Cialdini", "336", "1984", "HarperCollins"},
        {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "333", "2012", "Crown Publishers"},
        {"Man's Search for Meaning", "Viktor E. Frankl", "165", "1946", "Beacon Press"}
    };
    private String[][] politik = {
        {"Politik dan Kesejahteraan Rakyat", "Siti Nurwahidah", "200", "2018", "Gramedia"},
        {"Kebijakan Publik", "Andi Wijaya", "180", "2016", "Pustaka Abadi"},
        {"Demokrasi Modern", "Ahmad Santoso", "220", "2019", "Erlangga"},
        {"Isu Global dalam Politik", "Rina Puspita", "250", "2017", "Penerbit XYZ"},
        {"Politik dan Media Massa", "Budi Susanto", "190", "2020", "Deepublish"}
    };
    private String[][] fiksi = {
        {"To Kill a Mockingbird", "Harper Lee", "281", "1960", "J.B. Lippincott & Co."},
        {"1984", "George Orwell", "328", "1949", "Secker & Warburg"},
        {"Brave New World", "Aldous Huxley", "311", "1932", "Chatto & Windus"},
        {"The Great Gatsby", "F. Scott Fitzgerald", "180", "1925", "Charles Scribner's Sons"},
        {"One Hundred Years of Solitude", "Gabriel Garcia Marquez", "417", "1967", "Harper & Row"}
    };
    public void displayPilihan (){
        System.out.println("=====[Perpustakaan]======");
        System.out.println("Masukkan pilihan untuk melihat buku berdasarkan kategori:");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi");
        System.out.println("8. Tampilkan semua buku yang ada");
        System.out.println("9. Keluar dari program");
        System.out.print("Pilihan anda: ");
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
            System.out.println("");
            nomorBuku++;
        }
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
    public void setChoiceNumber(int choiceNumber) {
        this.choiceNumber = choiceNumber;
    }
    public void getChoiceNumber() {
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