/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pacee.mnemosyne;

/**
 *
 * @author mupac_000
 */
public class Mnemosyne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Domaine<String> Q1 = new Domaine("suka");

        
        Carte p = new Carte("Quel est mon âge","123");
        Carte p2 = new Carte("Quel est mon âge","123");
        
        Q1.addCard(new Carte("Quel est mon âge","123"));
        Q1.addCard(new Carte("Quel est mon nom","Pacifique"));
        Q1.addCard(new Carte("Quel est ton nom","AZe"));
        System.out.println(p2.compareTo(p));


    }
    
}
