/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3pp1;

/**
 *
 * @author ASUS
 */

//Latihan 2
public class StrukturList {
    private Node HEAD;

    // Constructor
    public StrukturList() {
        this.HEAD = null;
    }

    // Fungsi untuk menambahkan elemen di akhir/tail
    public void addTail(int data) {
        Node newNode = new Node(data); // Buat node baru dengan data yang diberikan

        // Jika list kosong, maka HEAD akan menunjuk ke newNode
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;

            // Melakukan iterasi sampai node terakhir ditemukan
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }

            // Menambahkan newNode setelah node terakhir
            curNode.setNext(newNode);
        }
    }

    // Method untuk mengecek apakah list kosong atau tidak
    public boolean isEmpty() {
        return HEAD == null;
    }
    
    
    //Latihan 3
    public void displayElement() {
    Node curNode = HEAD;
    while (curNode != null) {
        System.out.print(curNode.getData() + " ");
        curNode = curNode.getNext();
        }
    }
    
    //AddHead
        public void addHead(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

}

