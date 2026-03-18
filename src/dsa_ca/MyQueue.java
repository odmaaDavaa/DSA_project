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
    SLList mylist = new SLList();
    
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
        return mylist.size();
    }
    
    @Override
    public void enqueue(Object e){
        mylist.add(mylist.size(), (String)e);
    }
    
    @Override
    public Object dequeue(){
       if(size() == 0){
           return null;
       }else{
           return mylist.remove(1);
       }
    }
     @Override
    public Object frontOfQueue(){
        if(isEmpty()){
            return null;
        }else{
            return mylist.get(1);
        }
    }
    
    public String displayQueue(){
         StringBuilder strB = new StringBuilder();
        if(mylist.isEmpty()){
            strB.append("Empty queue");
        }else{
            //loop over and build uo string to return
            for(int i = 0; i < mylist.size(); i++){
                strB.append(mylist.get(i));
                strB.append("\n");
            }
        }
        return strB.toString();
    }
}
