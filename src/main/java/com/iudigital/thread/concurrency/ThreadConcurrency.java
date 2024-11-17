/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.iudigital.thread.concurrency;

import snthread.ThreadClass;
import snthread.ThreadClass2;

/**
 *
 * @author HP 255-G9
 */
public class ThreadConcurrency {

    public static void main(String[] args) {
        ThreadClass thread1 = new ThreadClass();
        ThreadClass2 thread2 = new ThreadClass2();
        thread1.start();
        thread2.start();
        System.out.println("Se termino el cobro");
    }
}
