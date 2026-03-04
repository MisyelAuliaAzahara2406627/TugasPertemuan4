/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan4;

    import java.util.Scanner;
/**
 *
 * @author asus
 */
public class TugasPertemuan4No2 {
    public static void main(String[] args) {

        // INPUT
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();  // nilai awal rentang

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt(); // nilai akhir rentang

        // PROSES
        // Mengecek bilangan ganjil
        int jumlahGanjil = 0; // variabel penghitung
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {   // cek apakah ganjil
                jumlahGanjil++; // tambah jika ganjil
            }
        }

        // OUTPUT
        System.out.println("Jumlah bilangan ganjil = " + jumlahGanjil);
    }
}
