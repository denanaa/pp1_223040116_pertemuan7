/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Node {
    private int nilai;
    private Node next;

    // Constructor
    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null;
    }

    // Setter & Getter untuk nilai
    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    // Setter & Getter untuk node selanjutnya (next)
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
       this.next = next;
    }
}
    
