/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pacee.mnemosyne;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mupac_000
 */
public class WipMatieres {
    List<Domaine> matieres;
    
    public WipMatieres()
    {
        this.matieres = new ArrayList();
    }
    
    public void addMatieres(Domaine d)
    {
        this.matieres.add(d);
    }

}
