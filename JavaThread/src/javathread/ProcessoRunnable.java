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
public class ProcessoRunnable implements Runnable{
    String print;
    boolean stop;
    
    public ProcessoRunnable(String print) {
        stop = false;
        this.print = print;
    }
    
    @Override
    public void run() {
        while(!stop) System.out.println(print);
    }
    
    public void stoppa(){
        stop = true;
    }
}
