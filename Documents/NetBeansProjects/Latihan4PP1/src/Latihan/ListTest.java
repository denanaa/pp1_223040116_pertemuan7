/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ASUS
 */
public class ListTest {
    public static void main(String[] args) {
        // 1. Membuat objek myList dari kelas StrukturList
        StrukturList myList = new StrukturList();
        
        // 2. Menambahkan elemen ke myList menggunakan method addTail
        myList.addTail(3);
        myList.addTail(4);
        
        // 3. Menambahkan elemen ke myList di posisi tengah menggunakan method addMiddle
        //    dengan nilai 7 pada posisi ke-2 dan nilai 8 pada posisi ke-2
        myList.addMiddle(7, 2);
        myList.addMiddle(8, 2);
        
        // 4. Menambahkan elemen ke myList di awal menggunakan method addHead dengan nilai 5
        myList.addHead(5);

        // 5. Menampilkan elemen-elemen myList menggunakan method displayElement
        System.out.println("Elemen List:");
        myList.displayElement();
    }
}

    
