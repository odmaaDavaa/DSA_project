/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca;

/**
 *
 * @author apple
 */
public class MyStack implements StackInterface{
    private Node head, curr;
    private int size;
    
    public MyStack(){
        //setting up the empty stack
        head = null;
        curr = null;
        size = 0;
    }
    @Override
    public int size(){
        return size;
    }
    
    @Override
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else
            return false;
    }
   
    public void push(Object element){
        Node newNode = new Node(element);
        //empty list
        if(size == 0){
            head = newNode; //nothing was in list so set the head to be the newNode
        }else{
            //adding to the top of the stack
            newNode.next = head; //setting up the reference
            head = newNode; //assign newNode to be the new head, adding it to the top position
        }
        size++; //size=size+1 increaing the size by 1
    }
    
    public Object pop(){
        //if empty stack
        if(size == 0){
            return null;
        }else{
            Node temp = head; //create temp node and assign the head to it
            head = head.getNext(); //re-assign head to the next one in list
            size--;
            return temp; //return the object
        }
    }
    
    public void displayStack(){
        Node aNode = head; //create a temp node and assign the head to it
        while(aNode != null){
            aNode.getElement();
            System.out.println(aNode.toString()); //print
            aNode = aNode.getNext(); //move to the next node
        }
    }
    
    public Object peek(){
        //check if stack empty
        if(size == 0){
            return null;
        }else{
            return head; //the head itemis the top of the stack so return it
        }
    }
    
    public void emptyStack(){
        head = null;
        size = 0;
    }
}
