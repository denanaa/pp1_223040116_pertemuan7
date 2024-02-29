/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ContohFungsi {
    // Fungsi untuk menjumlahkan dua bilangan
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Fungsi untuk mengalikan dua bilangan
    public static int kali(int a, int b) {
        return a * b;
    }

    public static void main (String[] args) {
        // Memanggil fungsi tambah dan menyimpan hasilnya dalam variabel
        int hasilPenjumlahan = tambah(5, 3);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        // Memanggil fungsi kali dan menyimpan hasilnya dalam variabel
        int hasilPerkalian = kali(4, 6);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
    }
}
    
//-Program akan menjalankan method main.
//-Pertama, program akan menjalankan method tambah(5, 3), yang akan menghasilkan nilai 8.
//-Kemudian, program akan mencetak hasil penjumlahan, yaitu "Hasil penjumlahan: 8".
//-Setelah itu, program akan menjalankan method kali(4, 6), yang akan menghasilkan nilai 24.
//-Program akan mencetak hasil perkalian, yaitu "Hasil perkalian: 24".
//Komentar tentang hasil eksekusi:
//
//-Hasil eksekusi program akan mencetak dua baris output.
//-Baris pertama adalah hasil penjumlahan dari 5 dan 3, yaitu 8.
//-Baris kedua adalah hasil perkalian dari 4 dan 6, yaitu 24.
