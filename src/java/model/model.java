/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author eli
 */
@Named(value = "model")
@Dependent
public class model {

    private final List<Objecte> llistaObjectes;
    
    public model() {
    llistaObjectes = new LinkedList<>();
    }   

    public List<Objecte> getLlistaObjectes() {
        return llistaObjectes;
    }
     
}
