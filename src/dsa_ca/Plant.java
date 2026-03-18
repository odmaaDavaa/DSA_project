/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca;

/**
 *
 * @author apple
 */
public class Plant {
    private String plantName;
    private int oxygenLevel;

    public Plant() {
    }

    public Plant(String plantName, int oxygenLevel) {
        this.plantName = plantName;
        this.oxygenLevel = oxygenLevel;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    @Override
    public String toString() {
        return "Plant{" + "plantName=" + plantName + ", oxygenLevel=" + oxygenLevel + '}';
    }
    
    
}
