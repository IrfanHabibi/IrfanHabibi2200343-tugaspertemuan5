/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodganjil1;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Scanner;

public class Methodganjil1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai N
        System.out.println("Masukkan nilai N:");
        int N = scanner.nextInt();

        // Menampilkan hasil penjumlahan deret
        System.out.println("Hasil dari penjumlahan deret adalah " + penjumlahanDeret(N));
    }

    // Method untuk menghitung penjumlahan deret
    public static int penjumlahanDeret(int N) {
        int hasil = 0;
        for (int i = 1; i <= N; i++) {
            hasil += i;
            // Cek apakah ini adalah iterasi terakhir
            if (i != N) {
                System.out.print(i + "+");
            } else {
                System.out.print(i);
            }
        }
        System.out.print("=");
        return hasil;
    }
}
