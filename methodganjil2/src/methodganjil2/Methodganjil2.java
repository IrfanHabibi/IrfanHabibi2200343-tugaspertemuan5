/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodganjil2;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Scanner;

public class Methodganjil2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan batas awal dan batas akhir
        System.out.println("Masukkan batas awal:");
        int batasAwal = scanner.nextInt();
        System.out.println("Masukkan batas akhir:");
        int batasAkhir = scanner.nextInt();

        // Menampilkan banyaknya bilangan ganjil
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah: " + hitungBanyakBilanganGanjil(batasAwal, batasAkhir));
    }

    // Method untuk menghitung banyaknya bilangan ganjil
    public static int hitungBanyakBilanganGanjil(int batasAwal, int batasAkhir) {
        int banyakGanjil = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                banyakGanjil++;
            }
        }
        return banyakGanjil;
    }
}
