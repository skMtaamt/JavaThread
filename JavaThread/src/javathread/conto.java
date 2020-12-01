/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author amati.mattia
 */
public class conto {
    
    private int totale, tasse = 100;

    public conto(int totale) {
        this.totale = totale;
    }

    public void versa (int somma){
        totale = totale + somma - tasse;
    }
    
    public int saldo(){
        return totale;
    } 
}
