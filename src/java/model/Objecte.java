/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author eli
 */
public class Objecte {
    private String nom;
    private double pes;

    public Objecte(String nom,double pes){
        this.nom=nom;
        this.pes=pes;
    }
    public String getNom() {
        return nom;
    }

    public double getPes() {
        return pes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }
    
  
    
}
