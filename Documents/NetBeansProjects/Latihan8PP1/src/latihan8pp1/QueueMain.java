/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan8pp1;

/**
 *
 * @author ASUS
 */

// //LATIHAN 4//
//public class QueueMain {
//    public static void main(String[] args) {
//        StrukturQueue queue = new StrukturQueue(); // Membuat objek antrian baru
//
//        // Sebelum Enqueue 3x
//        System.out.println("# Sebelum Enqueue 3x #");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//
//        // Enqueue 3x
//        System.out.println("### Enqueue 3x ###");
//        queue.enqueue(3);
//        queue.enqueue(2);
//        queue.enqueue(1);
//
//        // Setelah Enqueue 3x, front harusnya adalah 3
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        System.out.println("Front: " + queue.front()); 
//    }
//}

// //LATIHAN 5//
//public class QueueMain {
//    public static void main(String[] args) {
//        StrukturQueue queue = new StrukturQueue(); 
//
//        // Sebelum Enqueue 4x
//        System.out.println("### Sebelum Enqueue 4x ###");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        queue.displayElements();
//
//        // Enqueue 4x
//        System.out.println("\n### Enqueue 4x ###");
//        queue.enqueue(2);
//        queue.enqueue(7);
//        queue.enqueue(6);
//        queue.enqueue(1);
//
//        // Setelah Enqueue 4x
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        System.out.print("Elemen Queue: ");
//        queue.displayElements();
//        System.out.println("Front: " + queue.front());
//    }
//}

//TUGAS//
public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue(); 

        // Sebelum Enqueue 4x
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();

        // Enqueue 4x
        System.out.println("\n### Enqueue 4x ###");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        // Setelah Enqueue 4x
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();
        System.out.println("Front: " + queue.front());

        // Dequeue 2x
        System.out.println("\n### Dequeue 2x ###");
        queue.dequeue();
        queue.dequeue();

        // Setelah Dequeue 2x
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    }
}
