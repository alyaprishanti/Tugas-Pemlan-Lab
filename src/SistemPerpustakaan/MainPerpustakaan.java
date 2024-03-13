package SistemPerpustakaan;
import java.util.Scanner;
public class MainPerpustakaan {
    public static void main(String[] args) {
        String[][] teknologi = {
            {"Web Programming", "Fitri Marisa", "259", "2017", "Deepublish", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit aliquet"},
            {"Mobile App Development", "Arief Setiawan", "320", "2018", "Erlangga", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit"},
            {"Data Science Basics", "Rina Pratiwi", "200", "2019", "Gramedia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel"},
            {"Cybersecurity Essentials", "Budi Santoso", "280", "2016", "Pustaka Abadi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus"},
            {"Artificial Intelligence", "Dewi Susanti", "350", "2022", "Kompas Media", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius"}
        };
        String[][] filsafat = {
            {"Meditasi Filsafat", "Budi Santoso", "180", "2015", "Pustaka Abadi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit aliquet"},
            {"Pemikiran Kritis", "Citra Dewi", "220", "2018", "Erlangga", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit"},
            {"Etika Kontemporer", "Farhan Hidayat", "200", "2017", "Gramedia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel"},
            {"Pandangan Hidup", "Rahmat Wijaya", "240", "2019", "Penerbit XYZ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus"},
            {"Metafisika Modern", "Siti Rahayu", "190", "2016", "Novel Fantasi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius"}
        };
        String[][] sejarah = {
            {"Sejarah Nusantara", "Budi Santoso", "200", "2015", "Pustaka Abadi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit aliquet"},
            {"Perang Dunia II", "Dewi Susanti", "300", "2012", "Kompas Media", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit"},
            {"Runtuhnya Kerajaan Romawi", "Ahmad Ridwan", "250", "2018", "Gramedia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel"},
            {"Revolusi Industri", "Ratna Dewi", "180", "2020", "Erlangga", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus"},
            {"Perang Vietnam", "Agus Setiawan", "220", "2016", "Penerbit XYZ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius"}
        };
        String[][] agama = {
            {"Mengenal Agama", "Ahmad Budi", "150", "2015", "Pustaka Jaya", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit aliquet"},
            {"Buku Agama Hindu", "Rudi Santoso", "180", "2017", "Gramedia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit"},
            {"Perjalanan Rohani", "Siti Rahmah", "200", "2018", "Media Kita", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel"},
            {"Perjalanan Cinta Abadi", "Aulia Fitri", "220", "2016", "Erlangga", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus"},
            {"Kisah-Kisah Surga", "Dewi Susanti", "250", "2019", "Penerbit XYZ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius"}
        };
        String[][] psikologi = {
            {"The Power of Habit", "Charles Duhigg", "371", "2012", "Random House", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit aliquet"},
            {"Thinking, Fast and Slow", "Daniel Kahneman", "499", "2011", "Farrar, Straus and Giroux", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit"},
            {"Influence: The Psychology of Persuasion", "Robert B. Cialdini", "336", "1984", "HarperCollins", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel"},
            {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "333", "2012", "Crown Publishers", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus"},
            {"Man's Search for Meaning", "Viktor E. Frankl", "165", "1946", "Beacon Press", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius"}
        };
        String[][] politik = {
            {"Politik dan Kesejahteraan Rakyat", "Siti Nurwahidah", "200", "2018", "Gramedia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit aliquet"},
            {"Kebijakan Publik", "Andi Wijaya", "180", "2016", "Pustaka Abadi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit"},
            {"Demokrasi Modern", "Ahmad Santoso", "220", "2019", "Erlangga", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel"},
            {"Isu Global dalam Politik", "Rina Puspita", "250", "2017", "Penerbit XYZ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus"},
            {"Politik dan Media Massa", "Budi Susanto", "190", "2020", "Deepublish", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius"}
        };
        String[][] fiksi = {
            {"To Kill a Mockingbird", "Harper Lee", "281", "1960", "J.B. Lippincott & Co.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit aliquet"},
            {"1984", "George Orwell", "328", "1949", "Secker & Warburg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel suscipit"},
            {"Brave New World", "Aldous Huxley", "311", "1932", "Chatto & Windus", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus vel"},
            {"The Great Gatsby", "F. Scott Fitzgerald", "180", "1925", "Charles Scribner's Sons", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius, purus"},
            {"One Hundred Years of Solitude", "Gabriel Garcia Marquez", "417", "1967", "Harper & Row", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam varius"}
        };
        int pilihan;
        Scanner scan = new Scanner(System.in);
        do {
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
        pilihan = scan.nextInt();
        BukuPerpustakaan perpustakaan = new BukuPerpustakaan(teknologi, filsafat, sejarah, agama, psikologi, politik, fiksi, pilihan);
        System.out.println("");
        perpustakaan.pilihan();
        } while(pilihan != 9);
        scan.close();
    }
}