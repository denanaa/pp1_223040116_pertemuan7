/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

//Latihan-2 
//public class NodeMain {
//    public static void main(String[] args) {
//        // Membuat 2 buah node n1 & n2
//        Node n1 = new Node(5);
//        Node n2 = new Node(7);
//        // Membuat relasi Node n1 & n2
//        n1.setNext(n2);
//        // Menampilkan Node n1 & n2 dengan Pointer p
//        Node p = n1;
//        while (p != null) {
//            System.out.printf("%d ", p.getNilai());
//            p = p.getNext();
//        }
//    }
//}

//Tes-4 
//a. 5,7,9,8
//public class NodeMain {
//    public static void main(String[] args) {
//        // Membuat node-node
//        Node n1 = new Node(5);
//        Node n2 = new Node(7);
//        Node n3 = new Node(9);
//        Node n4 = new Node(8);
//        
//        // Menetapkan relasi antara node
//        n1.setNext(n2);
//        n2.setNext(n3);
//        n3.setNext(n4);
//        
//        // Menampilkan nilai dari setiap node
//        Node p = n1;
//        while (p != null) {
//            System.out.printf("%d ", p.getNilai());
//            p = p.getNext();
//        }
//    }
//}

//b. 2,3,5,7,9
public class NodeMain {
    public static void main(String[] args) {
        // Membuat node-node
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);
        
        // Menetapkan relasi antara node
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        
        // Menampilkan nilai dari setiap node
        Node p = n1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
