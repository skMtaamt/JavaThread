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
public class Sportello implements Runnable{
    conto contos;

    public Sportello(conto conto) {
        this.contos = conto;
    }
    
    @Override
    public void run() {
        
    }
    
    public void versa(int sommma){
        contos.versa(sommma);
        System.out.println("conot: " + contos.saldo());
    }
    
}
