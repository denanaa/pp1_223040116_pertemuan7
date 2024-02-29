/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class NodePecahan {
       
    //Definisi kelas Node
    private double data;
    private NodePecahan next;

    public NodePecahan(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public NodePecahan getNext() {
        return next;
    }

    public void setNext(NodePecahan next) {
        this.next = next;
    }
}
    