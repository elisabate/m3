/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import model.Objecte;
import model.model;
/**
 *
 * @author eli
 */
@Named(value = "controlador")
@Dependent
public class controlador {

       @Inject
       private model model;
        
       private String nom;
       private double pes;
        
       private List<Objecte> llistaObjectes;
        
       private List<Objecte> llistaObjectesSeleccionats;
        
       
       @PostConstruct
        void init(){
            llistaObjectes = model.getLlistaObjectes();
            
        }
        
        public String afegirObjecte() {
            Objecte objecte = new Objecte(nom, pes);
            model.getLlistaObjectes().add(objecte);
        return "index";
        }
        
        public String eliminarObjectes() {
            model.getLlistaObjectes().removeAll(llistaObjectesSeleccionats);
        return "index";
}
        
    }
    

