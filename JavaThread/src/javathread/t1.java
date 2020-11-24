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
public class t1 extends Thread {
    public void run(){
        while(true) System.out.println("t1");
    }
}
