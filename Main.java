package PhoneUser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Membuat objek Iphone
        Phone iphone15 = new Iphone();

        // Membuat objek Xiaomi
        Phone redmiNote8 = new Xiaomi();

        // Membuat objek Samsung
        Phone s24Ultra = new Samsung();

        // Membuat objek Oppo
        Phone findX = new Oppo();

        // Membuat objek user
        PhoneUser dian = new PhoneUser(redmiNote8);

        // Biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        System.out.println("=== PILIHAN HP ===");
        System.out.println("Masukkan nomor HP yang ingin digunakan:");
        System.out.println("[1] Xiaomi");
        System.out.println("[2] Iphone");
        System.out.println("[3] Samsung");
        System.out.println("[4] Oppo");
        System.out.println("--------------------------");
        System.out.print("Pilih nomor HP> ");
        int phoneNumber = input.nextInt();
        input.nextLine(); // Clear the buffer

        if (phoneNumber == 1) {
            dian = new PhoneUser(redmiNote8);
            System.out.println("HP berhasil diganti ke Xiaomi.");
        } 
        else if (phoneNumber == 2) {
            dian = new PhoneUser(iphone15);
            System.out.println("HP berhasil diganti ke Iphone.");
        } 
        else if (phoneNumber == 3) {
            dian = new PhoneUser(s24Ultra);
            System.out.println("HP berhasil diganti ke Samsung");
        }
        else if (phoneNumber == 4) {
            dian = new PhoneUser(findX);
            System.out.println("HP berhasil diganti ke Oppo");
        }
        else {
            System.out.println("Kamu memilih aksi yang salah!");
            System.exit(0);
        }

        // Kita coba nyalakan HP-nya
        dian.turnOnThePhone();

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[5] Ganti HP");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            String aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                dian.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("5")) {
                System.out.println("Masukkan nomor HP yang ingin digunakan:");
                System.out.println("[1] Xiaomi");
                System.out.println("[2] Iphone");
                System.out.println("--------------------------");
                System.out.print("Pilih nomor HP> ");
                phoneNumber = input.nextInt();
                input.nextLine(); // Clear the buffer

                if (phoneNumber == 1) {
                    dian = new PhoneUser(redmiNote8);
                    System.out.println("HP berhasil diganti ke Xiaomi.");
                } else if (phoneNumber == 2) {
                    dian = new PhoneUser(iphone15);
                    System.out.println("HP berhasil diganti ke Iphone.");
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                    System.exit(0);
                }
            } else if (aksi.equalsIgnoreCase("0")) {
                System.out.println("Keluar dari aplikasi.");
                System.exit(0);
            }
        }
    }
}