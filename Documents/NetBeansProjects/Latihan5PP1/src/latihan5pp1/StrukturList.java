/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5pp1;

/**
 *
 * @author SB601-39
 */
public class StrukturList {
    
    // Variabel untuk menunjukkan node pertama dalam linked list
    private Node head;
    
    // Method untuk menambahkan node di akhir linked list
    public void addTail(int data) {
        // Membuat node baru dengan data yang diberikan
        Node newNode = new Node(data);

        // Jika linked list kosong, node baru menjadi head
        if (isEmpty()) {
            head = newNode;
        } else {
            // Jika tidak, iterasikan sampai ke node terakhir
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            // Tambahkan node baru setelah node terakhir
            curNode.setNext(newNode);
        }
    }
    
    // Method untuk menambahkan node di awal linked list
    public void addHead(int data) {
        // Membuat node baru dengan data yang diberikan
        Node newNode = new Node(data);
        // Jika linked list kosong, node baru menjadi head
        if (head == null) {
            head = newNode;
        } else {
            // Jika tidak, node baru menjadi head baru, menggantikan head lama
            newNode.setNext(head);
            head = newNode;
        }
    }

    // Method untuk menambahkan node di posisi tengah linked list
    public void addMiddle(int data, int position) {
        // Membuat node baru dengan data yang diberikan
        Node newNode = new Node(data);

        // Jika linked list kosong atau posisi adalah 1, node baru menjadi head
        if (head == null || position == 1) {
            newNode.setNext(head);
            head = newNode;
        } else {
            // Jika tidak, iterasikan sampai ke posisi yang ditentukan
            Node curNode = head;
            Node posNode = null;
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
        Node curNode = head; // Menggunakan head dengan huruf kecil
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
    

    
        public void removeHead() {
        if (head == null) {
            System.out.println("List kosong");
        } else {
            Node temp = head;
            head = head.getNext();
            dispose(temp);
        }
    }

        public void removeTail() {
            Node preNode = null;
            Node lastNode = null;

            if (head != null) {
                if (head.getNext() == null) {
                    head = null;
                } else {
                    lastNode = head;

                    while (lastNode.getNext() != null) {
                        preNode = lastNode;
                        lastNode = lastNode.getNext();
                    }

                    preNode.setNext(null);
                    dispose(lastNode);
                }
            }
        }
        
        
    
    public void removeMid(int e) {
    Node preNode = new Node(0);
    Node tempNode;
    int i = 1;
    boolean ketemu = false;
    
    if (isEmpty()) {
        System.out.println("Elemen list kosong");
    } else {
        tempNode = head;
        while (tempNode.getNext() != null && !ketemu) {
            if (tempNode.getData() == e) {
                ketemu = true;
            } else {
                preNode = tempNode;
                tempNode = tempNode.getNext();
                i++;
            }
        }
        
        if (ketemu) {
            if (i == 1) {
                head = null;
            } else {
                preNode.setNext(tempNode.getNext());
                dispose(tempNode);
            }
        }  
      }
    }

    private void dispose(Node node) {
        node = null;
    }

}


    

