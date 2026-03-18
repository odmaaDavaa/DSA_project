/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca;



/**
 *
 * @author apple
 */
public class MyQueue implements QueueInterface{
    
    
    @Override
    public boolean isEmpty(){
        if(size() >0){
            return false;
        }else{
            return true;
        }
    }
    
    @Override
    public int size(){
        return theQueue.size();
    }
    
    @Override
    public void enqueue(Object e){
        theQueue.add(0, (String)e);
    }
    
    @Override
    public Object dequeue(){
       if(size() == 0){
           return null;
       }else{
           return theQueue.remove(0);
       }
    }
     @Override
    public Object frontOfQueue(){
        if(isEmpty()){
            return null;
        }else{
            return theQueue.get(0);
        }
    }
    
    public String displayQueue(){
         StringBuilder strB = new StringBuilder();
        if(theQueue.isEmpty()){
            strB.append("Empty stack");
        }else{
            //loop over and build uo string to return
            for(int i = 0; i < theQueue.size(); i++){
                strB.append(theQueue.get(i));
                strB.append("\n");
            }
        }
        return strB.toString();
    }
}
