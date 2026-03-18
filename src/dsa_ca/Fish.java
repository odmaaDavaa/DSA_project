/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca;

/**
 *
 * @author apple
 */
public class Fish {
    private String species;
    private int population;

    public Fish() {
    }

    public Fish(String species, int population) {
        this.species = species;
        this.population = population;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Fish{" + "species=" + species + ", population=" + population + '}';
    }
    
    
    
}
