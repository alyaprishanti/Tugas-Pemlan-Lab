package Inheritance;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Manusia lakiLakiMenikah = new Manusia("Akbar", true, "1111", true);
        System.out.println(lakiLakiMenikah + "\n");

        Manusia perempuanMenikah = new Manusia("Aisyah", false, "2222", true);
        System.out.println(perempuanMenikah + "\n");

        Manusia lakiLakiBelumMenikah = new Manusia("Faisal", true, "3333", false);
        System.out.println(lakiLakiBelumMenikah + "\n");

        MahasiswaFILKOM ipkKurang3 = new MahasiswaFILKOM("Puki", true, "4444", false, "23515040444", 2.9);
        System.out.println(ipkKurang3 + "\n");

        MahasiswaFILKOM ipk3Sampai3setengah = new MahasiswaFILKOM("Warni", false, "5555", false, "23515040555", 3.4); 
        System.out.println(ipk3Sampai3setengah + "\n");

        MahasiswaFILKOM ipkLebih3setengah = new MahasiswaFILKOM("Kompyang", true, "6666", false, "23515040666", 3.8);
        System.out.println(ipkLebih3setengah + "\n");

        Pekerja duaTahun2Anak = new Pekerja("Mulya", true, "7777", true, 500, LocalDate.of(2022, 3, 21), 2);
        System.out.println(duaTahun2Anak + "\n");

        Pekerja sembilanTahun = new Pekerja("Siti", false, "8888", false, 1000, LocalDate.of(2015, 4, 24), 0);
        System.out.println(sembilanTahun + "\n");

        Pekerja duaPuluhThn10Anak = new Pekerja("Rahma", false, "9999", true, 3000, LocalDate.of(2004, 3, 15), 10);
        System.out.println(duaPuluhThn10Anak + "\n");

        Manager manager = new Manager("George", true, "1010", false, 7500, LocalDate.of(2009, 2, 9), 0, "IT");
        System.out.println(manager + "\n");
    }
}
