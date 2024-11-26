
package com.mycompany.tugaskuiss;

import java.util.Scanner;

public class TUGASKUISS {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kode Barang (A/B/C): ");
        char kodeBarang = scanner.next().charAt(0);
        System.out.print("Masukkan Quantity: ");
        int quantity = scanner.nextInt();

        String namaBarang = "";
        int hargaBarang = 0;

        if (kodeBarang == 'A') {
            namaBarang = "LEVIS";
            hargaBarang = 500000;
        } 
        else if (kodeBarang == 'B') {
            namaBarang = "LEA";
            hargaBarang = 400000;
        } 
        else if (kodeBarang == 'C') {
            namaBarang = "LEE";
            hargaBarang = 300000;
        } 
        else {
            System.out.println("Kode barang tidak valid.");
            return;
        }

        int totalHarga = hargaBarang * quantity;

        System.out.println("\nNama Barang  : " + namaBarang);
        System.out.println("Harga Satuan : Rp. " + hargaBarang);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Harga  : Rp. " + totalHarga);
    }
    
}
