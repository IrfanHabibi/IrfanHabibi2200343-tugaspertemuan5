/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodganjil3;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Scanner;

public class Methodganjil3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai n
        System.out.println("Masukkan nilai n:");
        int n = scanner.nextInt();

        // Memanggil method untuk menghitung faktorial dan menampilkan hasilnya
        System.out.println(n + "! = " + hitungFaktorial(n));
    }

    // Method untuk menghitung faktorial
    public static String hitungFaktorial(int n) {
        if (n == 0) {
            return "1";
        } else {
            int hasil = 1;
            StringBuilder faktorial = new StringBuilder();
            for (int i = n; i >= 1; i--) {
                hasil *= i;
                faktorial.append(i);
                if (i != 1) {
                    faktorial.append("*");
                }
            }
            return faktorial + "=" + hasil;
        }
    }
}
