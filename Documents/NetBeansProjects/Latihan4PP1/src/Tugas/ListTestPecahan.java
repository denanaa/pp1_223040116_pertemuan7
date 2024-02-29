/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class ListTestPecahan {
    
//    public static void main(String[] args) {
//        // 1. Membuat objek myList dari kelas StrukturListPecahan
//        StrukturListPecahan myList = new StrukturListPecahan();
//        
//        // 2. Menambahkan node ke list menggunakan method addHead dan addTail
//        myList.addTail(3.4);  // Menambahkan 3.4 di akhir
//        myList.addMiddle(4.5);  // Menambahkan 4.5 di akhir
//        myList.addHead(2.1);  // Menambahkan 2.1 di awal
//        
//        // 3. Menampilkan elemen-elemen list menggunakan method displayElement
//         myList.displayElement();
//         System.out.println(); // Tambahkan baris baru setelah menampilkan elemen-elemen list
//
//    }

    
public static void main(String[] args) {
    // 1. Membuat objek myList dari kelas StrukturListPecahan
    StrukturListPecahan myList = new StrukturListPecahan();
    
    // 2. Menambahkan node ke list dengan berbagai metode
     myList.addHead(3.4);  // Menambahkan 3.4 di awal
     myList.addMiddle(2.1, 2); // Menambahkan 1.1 di posisi tengah (setelah 3.4)
     myList.addTail(1.1);  // Menambahkan 2.1 di akhir
     myList.addTail(4.5);  // Menambahkan 4.5 di akhir
     myList.addTail(5.5);  // Menambahkan 5.5 di akhir
    
    // 3. Menampilkan elemen-elemen list menggunakan method displayElement
    myList.displayElement();
    System.out.println(); // Tambahkan baris baru setelah menampilkan elemen-elemen list
}

}
    

