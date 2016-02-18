/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pacee.mnemosyne;

import java.util.Date;

/**
 *
 * @author mupac_000
 * @param <T>
 */
public class Carte<T> implements Comparable<Carte> {
    private T question;
    private T response;
    Value level;
    Date next;
    
    public Carte(T q, T r)
    {
        question = q;
        response = r;
        this.next = new Date();
    }

    @Override
    public int compareTo(Carte o) {
          
          return o.next.compareTo(this.next) ;
      
    }
    
    enum Value{
        ONE,TWO,THREE,FOUR,FIVE;
    }
    public T getQuestion()
    {
       return question;
    }
    
        public T getAnswer()
    {
       return response;
    }
}
