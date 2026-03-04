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
public class TugasPertemuan4No3 {
    public static void main(String[] args) {
        
        // ===== INPUT =====
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (>=0): ");
        int n = input.nextInt();

        // ===== PROSES =====
        int faktorial = 1;

        System.out.print(n + "! = ");

        for (int i = n; i >= 1; i--) {
            faktorial *= i;
            System.out.print(i);

            if (i > 1) {
                System.out.print("*");
            }
        }

        // Jika n = 0
        if (n == 0) {
            System.out.print("1");
        }

        // ===== OUTPUT =====
        System.out.println(" = " + faktorial);
    }
}
