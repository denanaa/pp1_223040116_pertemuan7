/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan8pp1;

/**
 *
 * @author ASUS
 */


//public class StrukturQueue {
//    //LATIHAN 2.A//
//    private Node FRONT; // Atribut FRONT bertipe Node
//    private Node REAR; // Atribut REAR bertipe Node
//
//    public StrukturQueue() {
//        FRONT = null; // Inisialisasi FRONT dan REAR menjadi null saat objek dibuat
//        REAR = null;
//    }
//     
//    //LATIHAN 2.B//
//    public boolean isEmpty() {
//        return FRONT == null; // Kembalikan true jika FRONT adalah null, artinya antrian kosong
//    }
//    
//    //LATIHAN 1//
//    public void enqueue (int data) {
//        Node newNode = new Node(data); // Tanda titik koma (;) di akhir baris
//        if (isEmpty()) {
//            FRONT = newNode;
//            REAR = newNode; // Operator assignment (=), bukan (-)
//        } else {
//            REAR.setNext(newNode); // Kedua kata "Node" yang benar, dan berikan spasi setelah titik
//            REAR = newNode;
//        }
//    }
//    
//    //LATIHAN 3//
//    public int size() { 
//    int size = 0;
//    Node curNode = FRONT; 
//    while (curNode != null) { 
//        size++; 
//        curNode = curNode.getNext(); 
//    }
//    return size; 
//    } 
//    
//   public int front() {
//       return FRONT != null ? FRONT.getData() : -1;
//   }
//
//}


//LATIHAN 5 & TUGAS//
public class StrukturQueue {
    private Node FRONT;
    private Node REAR;

    public StrukturQueue() {
        FRONT = null;
        REAR = null;
    }

    public boolean isEmpty() {
        return FRONT == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }
    
    //TUGAS//
    public int dequeue() {
    if (isEmpty()) {
        throw new RuntimeException("Queue is empty");
    } else {
        int data = FRONT.getData();
        FRONT = FRONT.getNext();
        if (FRONT == null) {
            REAR = null;
        }
        return data;
    }
}


    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            return FRONT.getData();
        }
    }

    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }
    
    //LATIHAN 5//
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
        } else {
            System.out.print("Elemen Queue: ");
            Node curNode = FRONT;
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
    
}
