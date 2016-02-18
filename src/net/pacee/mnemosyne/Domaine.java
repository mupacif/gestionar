/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pacee.mnemosyne;


import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author mupac_000
 */
public class Domaine<T> {

    String titre;
    SortedSet<Carte<T>> matieres;

    public Domaine(String title) {
        this.titre = title;
        matieres = new TreeSet();

    }

    Domaine() {
       
    }

    public void addCard(Carte<T> card) {
        this.matieres.add(card);
    }
    
    public Carte getLast()
    {
        return  matieres.last();
    }
    
        public Carte getFirst()
    {
        return  matieres.first();
    }
}
