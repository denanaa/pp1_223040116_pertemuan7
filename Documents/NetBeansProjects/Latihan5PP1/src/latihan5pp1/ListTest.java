/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5pp1;

/**
 *
 * @author SB601-39
 */
public class ListTest {
    
    public static void main(String[] args) {
        // 1. Membuat objek myList dari kelas StrukturList
        StrukturList myList = new StrukturList();
              
        
        System.out.println("Latihan 1&2 : removeHead");
        myList.addHead(2);
        myList.addHead(9);
        myList.addHead(7);
        myList.displayElement();
        
        System.out.println(" ");
        myList.removeHead();
        myList.displayElement();
        
        System.out.println(" ");
        myList.removeHead();
        myList.removeHead();
        myList.removeHead();
        myList.displayElement();
        
        System.out.println(" ");
        
        System.out.println("Latihan 3&4 : removeTail");
        myList.addTail(2);
        myList.addTail(6);
        myList.addTail(3);
        myList.addTail(5);
        myList.addTail(1);
        myList.displayElement();
        
        System.out.println(" ");
        myList.removeTail();
        myList.displayElement();  
        
        System.out.println(" ");
        myList.removeHead();
        myList.displayElement(); 
        
        System.out.println(" ");
        myList.removeTail();
        myList.displayElement(); 
        System.out.println(" ");
        
        System.out.println(" ");
        
        System.out.println("Latihan 1&2 : removeMiddle");
        myList.addTail(2);
        myList.addTail(6);
        myList.addTail(3);
        myList.addTail(5);
        myList.addTail(1);
        myList.removeHead();
        myList.removeHead();
        myList.displayElement();
        
        myList.removeMid(3);
        
        System.out.println(" ");
        myList.displayElement();
        
        myList.removeMid(6);       
        myList.removeMid(5);
        
        System.out.println(" ");
        myList.displayElement();
        
    }
    
}

    
