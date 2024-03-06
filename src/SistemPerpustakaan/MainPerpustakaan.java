package SistemPerpustakaan;
import java.util.Scanner;
public class MainPerpustakaan {
    public static void main(String[] args) {
        bukuPerpustakaan perpustakaan = new bukuPerpustakaan();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
        perpustakaan.displayPilihan();
        pilihan = scan.nextInt();
        scan.nextLine();
        perpustakaan.setChoiceNumber(pilihan);
        System.out.println("");
        perpustakaan.getChoiceNumber();
        } while(pilihan != 9);
        scan.close();
    }
}