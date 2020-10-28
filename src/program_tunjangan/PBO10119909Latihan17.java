package program_tunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10119909Latihan17 {


    public static void main(String[] args) {
        int gaji_pokok;
        double tunjangan, totalgaji;

        System.out.print("===========Program Tunjangan===========\n");
        System.out.print("Berapa Gaji pokok anda perbulan : ");
        Scanner scanner = new Scanner(System.in);
        gaji_pokok = scanner.nextInt();
        System.out.print("Status anda? (Menikah/Belum) : ");
        String status = scanner.next();
        tunjangan = (status.equals("menikah") || status.equals("Menikah"))?0.35*gaji_pokok:0;
        totalgaji = gaji_pokok + tunjangan;
        System.out.println("Gaji Pokok \t\t: "+gaji_pokok);
        System.out.printf("Tunjangan\t\t: %.0f%n", tunjangan);
        System.out.printf("Total Gaji\t\t: %.0f%n", totalgaji);
        scanner.close();

    }


}
