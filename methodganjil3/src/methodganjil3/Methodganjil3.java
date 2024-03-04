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
        System.out.println(n + " =" + faktorial(n));
    }

    // Method untuk menghitung faktorial n
    public static int faktorial(int n) {
        if (n == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(n);
            System.out.print(" * ");
            return n * faktorial(n - 1);
        }
    }
}
