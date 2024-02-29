/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3pp1;

/**
 *
 * @author ASUS
 */

//Latihan 1
public class Node {
    
    private int data;
    private Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
    }

    // Setter untuk data
    public void setData(int data) {
        this.data = data;
    }

    // Getter untuk data
    public int getData() {
        return data;
    }

    // Setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }
}
