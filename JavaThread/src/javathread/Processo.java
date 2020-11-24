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
public class Processo extends Thread {
    String print;

    public Processo(String print) {
        this.print = print;
    }
    
    public void run(){
        while(true) System.out.println(print);
    }
}
