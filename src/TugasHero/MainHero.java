package TugasHero;
import java.util.Scanner;
public class MainHero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //input untuk player1
        System.out.println("\nPermainan adu hero\nPlayer 1: Silakan masukkan hero Anda! Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n=================================");
        System.out.print("Nama Hero\t: ");
        Hero player1 = new Hero(); //constructor kosong
        player1.setName(scan.nextLine());
        double hp1, attack1, defense1;
        do{
            System.out.print("Health Point\t: ");
            hp1 = scan.nextDouble();
            if(hp1 <= 500 && hp1 > 0){
                player1.setHp(hp1);
                break;
            } else{
                System.out.println("Angka harus di antara 0 sampai 500, silakan masukkan ulang.");
            }
        } while (hp1 > 500 || hp1 <= 0);
        do{
            System.out.print("Attack\t\t: ");
            attack1 = scan.nextDouble();
            if(attack1 <= 500 && attack1 > 0){
                player1.setAttack(attack1);;
                break;
            } else{
                System.out.println("Angka harus di antara 0 sampai 500, silakan masukkan ulang.");
            }
        } while (attack1 > 500 || attack1 <= 0);
        do{
            System.out.print("Defense\t\t: ");
            defense1 = scan.nextDouble();
            if(defense1 <= 500 && defense1 > 0){
                player1.setDefense(defense1);
                break;
            } else{
                System.out.println("Angka harus di antara 0 sampai 500, silakan masukkan ulang.");
            }
        } while (defense1 > 500 || defense1 <= 0);
        scan.nextLine();
        //input untuk player2
        System.out.println("\nPermainan adu hero\nPlayer 2: Silakan masukkan hero Anda! Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n=================================");
        System.out.print("Nama Hero\t: ");
        String name2 = scan.nextLine();
        double hp2, attack2, defense2;
        do{
            System.out.print("Health Point\t: ");
            hp2 = scan.nextDouble();
            if(hp2 > 500 || hp2 <= 0){
                System.out.println("Angka harus di antara 0 sampai 500, silakan masukkan ulang.");
                scan.nextLine();
            }
        } while (hp2 > 500 || hp2 <= 0);
        do{
            System.out.print("Attack\t\t: ");
            attack2 = scan.nextDouble();
            if(attack2 > 500 || attack2 <= 0){
                System.out.println("Angka harus di antara 0 sampai 500, silakan masukkan ulang.");
                scan.nextLine();
            }
        } while (attack2 > 500 || attack2 <= 0);
        do{
            System.out.print("Defense\t\t: ");
            defense2 = scan.nextDouble();
            if (defense2 > 500 || defense2 <= 0){
                System.out.println("Angka harus di antara 0 sampai 500, silakan masukkan ulang.");
                scan.nextLine();
            }
        } while (defense2 > 500 || defense2 <= 0);
        Hero player2 = new Hero(name2, hp2, attack2, defense2); // full constructor
        System.out.println("=================================\n=================================");

        int round = 1;
        do {
            System.out.println("Ronde " + round);
            // player2 menyerang
            System.out.println(player2.getName() + " menyerang " + player1.getName() + "\n");
            double damage1 = player2.getAttack() - player1.getDefense();
            player1.setHp(player1.getHp() - damage1);
            System.out.println(player2.getName() + " menyerang sebesar " + player2.getAttack());
            System.out.println(player1.getName() + " memiliki pertahanan sebesar " + player1.getDefense());
            if (player1.getHp() < 0){
                System.out.println("Health " + player1.getName() + " saat ini " + 0.0 + "\n");
            } else {
                System.out.println("Health " + player1.getName() + " saat ini " + player1.getHp() + "\n");
            }
            // cek player1
            if (player1.getHp() <= 0) {
                System.out.println("Pertarungan telah usai!\n"+ player1.getName() + " telah kalah!\n=======================================\n" + player2.getName() + " adalah pemenangnya");
                break;
            }
            // player1 menyerang
            System.out.println(player1.getName() + " menyerang " + player2.getName()+ "\n");
            double damage2 = player1.getAttack() - player2.getDefense();
            player2.setHp(player2.getHp() - damage2);
            System.out.println(player1.getName() + " menyerang sebesar " + player1.getAttack());
            System.out.println(player2.getName() + " memiliki pertahanan sebesar " + player2.getDefense());
            if (player2.getHp() < 0){
                System.out.println("Health " + player2.getName() + " saat ini " + 0.0 + "\n");
            } else {
                System.out.println("Health " + player2.getName() + " saat ini " + player2.getHp() + "\n");
            }
            // cek player2
            if (player2.getHp() <= 0) {
                System.out.println("Pertarungan telah usai!\n"+ player2.getName() + " telah kalah!\n=======================================\n" + player1.getName() + " adalah pemenangnya");
                break;
            } round++;
        } while (player1.getHp() > 0 && player2.getHp() > 0);
        scan.close();
    } 
}