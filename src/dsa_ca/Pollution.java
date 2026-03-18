/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca;

/**
 *
 * @author apple
 */
public class Pollution {
    private String toxinType;
    private int toxinLevel;

    public Pollution() {
    }

    public Pollution(String toxinType, int toxinLevel) {
        this.toxinType = toxinType;
        this.toxinLevel = toxinLevel;
    }

    public String getToxinType() {
        return toxinType;
    }

    public void setToxinType(String toxinType) {
        this.toxinType = toxinType;
    }

    public int getToxinLevel() {
        return toxinLevel;
    }

    public void setToxinLevel(int toxinLevel) {
        this.toxinLevel = toxinLevel;
    }

    @Override
    public String toString() {
        return "Pollution{" + "toxinType=" + toxinType + ", toxinLevel=" + toxinLevel + '}';
    }
    
    
}
