/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6pp1;

/**
 *
 * @author ASUS
 */
public class StrukturList {
    private Node head;
    
    public void addTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    
    public void displayElement() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }

    
    public boolean find(int data) {
    Node curNode = head;
    boolean ketemu = false;
    while (curNode != null) {
        if (curNode.getData() == data) {
            ketemu = true;
            break;
        } else {
            curNode = curNode.getNext(); 
        }
    }
    return ketemu;
}
    
    public int size() {
    Node curNode = head;
    int jumlah = 0;
    
    while (curNode != null) {
        jumlah++;
        curNode = curNode.getNext();
    }
    
    return jumlah;
    }
}
