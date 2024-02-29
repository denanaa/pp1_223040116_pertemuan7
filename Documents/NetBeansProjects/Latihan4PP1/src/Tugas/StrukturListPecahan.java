/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class StrukturListPecahan {
    // Deklarasi head sebagai node pertama dalam linked list
    private NodePecahan head;

    // Method untuk menambahkan node di akhir linked list
    public void addTail(double data) {
        // Membuat node baru dengan data yang diberikan
        NodePecahan newNode = new NodePecahan(data);

        // Jika linked list kosong, node baru menjadi head
        if (isEmpty()) {
            head = newNode;
        } else {
            // Jika tidak, iterasikan sampai ke node terakhir
            NodePecahan curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            // Tambahkan node baru setelah node terakhir
            curNode.setNext(newNode);
        }
    }

    // Method untuk menambahkan node di awal linked list
    public void addHead(double data) {
        // Membuat node baru dengan data yang diberikan
        NodePecahan newNode = new NodePecahan(data);
        
        // Jika linked list kosong, node baru menjadi head
        if (head == null) {
            head = newNode;
        } else {
            // Jika tidak, node baru menjadi head baru, menggantikan head lama
            newNode.setNext(head);
            head = newNode;
        }
    }

    // Method untuk menambahkan node di posisi tertentu dalam linked list
    public void addMiddle(double data, int position) {
        // Membuat node baru dengan data yang diberikan
        NodePecahan newNode = new NodePecahan(data);

        // Jika linked list kosong atau posisi adalah 1, node baru menjadi head
        if (head == null || position == 1) {
            newNode.setNext(head);
            head = newNode;
        } else {
            // Jika tidak, iterasikan sampai ke posisi yang ditentukan
            NodePecahan curNode = head;
            NodePecahan posNode = null;
            int i = 1;
            while (curNode != null && i < position) {
                posNode = curNode;
                curNode = curNode.getNext();
                i++;
            }
            // Jika posisi ditemukan, sisipkan node baru di antara posNode dan curNode
            if (curNode != null) {
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            } else {
                // Jika posisi melebihi jumlah node yang ada, tambahkan node baru di akhir list
                posNode.setNext(newNode);
            }
        }
    }

    // Method untuk memeriksa apakah linked list kosong atau tidak
    public boolean isEmpty() {
        return head == null;
    }

    // Method untuk menampilkan semua elemen dalam linked list
    public void displayElement() {
        NodePecahan curNode = head;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
}


