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
public class TugasPertemuan4No1 {
    public static void main(String[] args) {
        
        // INPUT
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = input.nextInt();   // menyimpan nilai n dari user

        // PROSES + OUTPUT
        System.out.println("Bilangan dari 1 sampai " + n + " adalah:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }   
}

