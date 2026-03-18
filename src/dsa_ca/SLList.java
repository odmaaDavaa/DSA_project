/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca;

/**
 *
 * @author apple
 */
public class SLList implements LinkedListInterface{
    private Node head;
    private Node curr;
    private Node prev;
    private int size;
    
    public SLList(){
        size = 0;
        head = null;
        curr = null;
        prev = null;
    }

    @Override
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int size(){
        return size;
    }
    
    public void add(int index, Object element){
        if(index == 1){ // and not an  empty list
            Node newNode = new Node(element, head);
            head = newNode;
        }else if(head == null){
            Node newNode = new Node(element, null);
            head = newNode;
        }else{
            setCurrent(index); // set the pointer for curr
            Node newNode = new Node(element,curr);
            newNode.next= curr.next; 
            curr.next = newNode; 
            
            //alternative to line 53 and 54
            //prev.setNext(newNode);       
            
        }
        size++; //Reminder!!
    }
    private void setCurrent(int index){
        //set curr to the node specified by the index
        //set prev to point to node prev to curr
        curr = head; // setting the pointer of curr to point at the head node
        prev = null;
        for(int i = 1; i < index; i++){
            prev = curr;
            curr = curr.getNext();
        }
    }
    @Override
    public void remove(int index){
        //move to that link
        // reset pointer to ignore the nde at that index
        //update size
        
        if(index == 1){
            head = head.getNext();
        }else{
            setCurrent(index);
            curr = curr.getNext();
            prev.next = curr;
        }
        size--; //reduce counter by 1
    }
    public void printList(){
        Node aNode = head;
        while(aNode != null){
            System.out.println(aNode.getElement().toString());
            aNode = aNode.getNext();
                
        }
           
    }
}
