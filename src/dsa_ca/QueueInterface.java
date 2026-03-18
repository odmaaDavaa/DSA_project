/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dsa_ca;

/**
 *
 * @author apple
 */
public interface QueueInterface {
    public void enqueue(Object e);
    public Object dequeue();
    public Object frontOfQueue();
    public int size();
    public boolean isEmpty();
}
