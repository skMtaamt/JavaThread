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
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//        Processo t = new Processo("t1" );
//        t.start();
//        Thread.sleep(5000);
//        t.stop();
//        Processo t2 = new Processo("t2");
//        t2.start();
//        ProcessoRunnable p1 = new ProcessoRunnable("p1");
//        Thread t1 = new Thread(p1);
//        t1.start();
//        Thread.sleep(5000);
//        p1.stoppa();
//        t1.stop();
    

        conto c = new conto(2000);
        Sportello sport1 = new Sportello(c);
        Sportello sport2 = new Sportello(c);
        Thread genitore1 = new Thread(sport1);
        Thread genitore2 = new Thread(sport2);
        
        genitore1.start();
        genitore2.start();
        
        sport1.versa(500);
        sport1.versa(800);
    }
    
}
